package com.springcore.collection;

import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.Properties;


public class Employee {
	private String name;
	private List<String> phoneNos;
	private Set<String> addresses;
	private Map<String,String> courses;
	private Properties props;
	
	
	
	public Employee(String name, List<String> phoneNos, Set<String> addresses, Map<String, String> courses,
			Properties props) {
		super();
		this.name = name;
		this.phoneNos = phoneNos;
		this.addresses = addresses;
		this.courses = courses;
		this.props = props;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, List<String> phoneNos, Set<String> addresses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phoneNos = phoneNos;
		this.addresses = addresses;
		this.courses = courses;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhoneNos() {
		return phoneNos;
	}
	public void setPhoneNos(List<String> phoneNos) {
		this.phoneNos = phoneNos;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phoneNos=" + phoneNos + ", addresses=" + addresses + ", courses=" + courses
				+ ", props=" + props + "]";
	}
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	
	
}
