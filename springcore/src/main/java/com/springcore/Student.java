package com.springcore;

public class Student {

	private String studentName;
	private int studentId;
	private String studentAdress;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentAdress() {
		return studentAdress;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentId=" + studentId + ", studentAdress=" + studentAdress
				+ "]";
	}
	public void setStudentAdress(String studentAdress) {
		this.studentAdress = studentAdress;
	}
	public Student(String studentName, int studentId, String studentAdress) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentAdress = studentAdress;
	}
	
	
	
}
