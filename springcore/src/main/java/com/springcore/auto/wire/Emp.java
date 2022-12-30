package com.springcore.auto.wire;

public class Emp {

	private Address address;

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Emp(Address address) {
	
		super();
		System.out.println("setting address  value in emp class using constructor");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}


	public void setAddress(Address address) {
		System.out.println("setting address  value in emp class ussing setter");
		this.address = address;
	}
	
	
}
