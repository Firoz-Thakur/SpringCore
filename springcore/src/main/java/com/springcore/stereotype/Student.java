package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// component annotation will create object with name of same as that of class name with camel case 
//all the intial values will be null

// @Componenet(ObjectName)- > we can explicitily give the name of the object

@Component
public class Student {

	@Value("Firoz kumar")
	private String studentName;
	@Value("chandigarh city 14")
	private String city;
	@Value("#{list}")
	private List<String> address;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;

	//creating object with the help of spEL.
	@Value("#{new java.lang.String('firoz bhai object')}")
	private String stringName;
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	
	public String getStringName() {
		return stringName;
	}
	public void setStringName(String stringName) {
		this.stringName = stringName;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + ", z=" + z
				+ ", stringName=" + stringName + "]";
	}
	
	
}


