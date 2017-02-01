package store;

import java.util.Date;

public class Student {

	private int roll;
	private String name;
	private int grade;
	private boolean editable;

	private double amount;
	private String creditCard;

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	
	public Student() {

	}

	public Student(int roll, String name, int grade, boolean editable, double amount, String creditCard) {
		super();
		this.roll = roll;
		this.name = name;
		this.grade = grade;
		this.editable = editable;
		this.amount = amount;
		this.creditCard = creditCard;
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
