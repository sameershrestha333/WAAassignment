package store;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named("test")
@SessionScoped
public class StudentBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Student student;
	private static final List<Student> studentList = new ArrayList<Student>(
			Arrays.asList(new Student(101, "Sameer", 8), new Student(102, "Amir", 9), new Student(103, "Manjog", 5)));

	/*
	 * public String addStudent() { studentList.add(new Student(roll, name,
	 * grade));
	 * 
	 * if(studentList.size()<0){ return "students"; }
	 * 
	 * return "students?faces-redirect=true"; }
	 */

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
}
