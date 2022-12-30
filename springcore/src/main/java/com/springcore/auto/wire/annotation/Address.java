package com.springcore.auto.wire.annotation;

public class Address {

	private String street;
	private String city;
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		System.out.println("settin street value in address class using setter");

		this.street = street;
	}
	
	public void setCity(String city) {
		System.out.println("settin city value in address class using setter ");
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	
	
}
