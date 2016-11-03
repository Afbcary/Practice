package main.codewars;

public class Student {

	private final String firstName;
	private final String lastName;
	private final String studentNumber;

	public Student(String firstName, String lastName, String studentNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.studentNumber = studentNumber;
	}

	public String getFullName() {
		return firstName + " " + lastName;
	}

	public String getCommaName() {
		return lastName + ", " + firstName;
	}

	public String getStudentNumber() {
		return studentNumber;
	}
}