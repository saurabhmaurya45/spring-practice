package com.springcore.ref;

public class Address {
	private String village;
	private String city;
	private String state;
	
	public Address(String village, String city, String state) {
		super();
		this.village = village;
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getVillage() {
		return village;
	}
	public void setVillage(String village) {
		this.village = village;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [village=" + village + ", city=" + city + ", state=" + state + "]";
	}
	
}
