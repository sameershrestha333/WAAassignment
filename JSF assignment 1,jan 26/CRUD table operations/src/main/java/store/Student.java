package store;

public class Student {

	private int roll;
	private String name;
	private int grade;
	private boolean editable;

	public Student(int roll, String name, int grade) {
		this.roll = roll;
		this.name = name;
		this.grade = grade;
	}

	public boolean isEditable() {
		return editable;
	}

	public void setEditable(boolean editable) {
		this.editable = editable;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

}
