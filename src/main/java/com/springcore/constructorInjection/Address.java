package com.springcore.constructorInjection;

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
		
		@Override
		public String toString() {
			return "Address [village=" + village + ", city=" + city + ", state=" + state + "]";
		}
		

}
