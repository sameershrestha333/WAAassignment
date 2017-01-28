package store;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

@ManagedBean(name = "test")
@RequestScoped
public class StudentBean implements Serializable {
	private String locale;

	private static final long serialVersionUID = 1L;
	private Student student;
	private static final List<Student> studentList = new ArrayList<Student>(
			Arrays.asList(new Student(101, "Sameer", 8, false, 33.33, "1123223333333"),
					new Student(102, "Amir", 9, false, 22.22, "222244342342"),
					new Student(103, "Manjog", 5, false, 44.333, "369476973454")));

	public StudentBean() {
		this.student = new Student();

	}

	/*
	 * public String addStudent() { studentList.add(new Student(roll, name,
	 * grade));
	 * 
	 * if(studentList.size()<0){ return "students"; }
	 * 
	 * return "students?faces-redirect=true"; }
	 */

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
		UIViewRoot viewRoot = FacesContext.getCurrentInstance().getViewRoot();
		viewRoot.setLocale(new Locale(locale));
	}

	public String deleteStudent() {
		studentList.remove(student);
		return null;
	}

	public String editStudent() {
		student.setEditable(true);
		return null;
	}

	public String saveStudents() {
		for (Student student : studentList) {
			student.setEditable(false);
		}
		return null;
	}

	public List<Student> getStudents() {
		return studentList;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String addStudent() {
		// Student studnet = new Student(student.getRoll(), student.getName(),
		// student.getGrade(),student.isEditable(),student.getAmount(),student.getCreditCard());
		studentList.add(student);
		return "students?faces-redirect=true";
	}

	public String showAddForm() {
		return "add-student?faces-redirect=true";
	}

	public void validateNumber(FacesContext faceContext, UIComponent component, Object value)
			throws ValidatorException {
		double enteredamount = (Double) value;		

		if (enteredamount < 0 && enteredamount > 100) {
			FacesMessage message = new FacesMessage("Enter for 0-100");
			throw new ValidatorException(message);
		}
	}
}
