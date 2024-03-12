 package com.springcore.auto.wire;

public class Emp {
	private Address address1;

	public Emp(Address address1) {
		super();
		this.address1 = address1;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Emp [address=" + address1 + "]";
	}

	public Address getAddress1() {
		return address1;
	}

	public void setAddress1(Address address1) {
		this.address1 = address1;
	}
	
	

}
