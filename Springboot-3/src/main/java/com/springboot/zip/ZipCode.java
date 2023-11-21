package com.springboot.zip;

public class ZipCode {
	String state;
	String city;
	String country;
	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



@Override
	public String toString() {
		return "ZipCode [state=" + state + ", city=" + city + ", country=" + country + "]";
	}



public ZipCode(String state, String city, String country) {
		super();
		this.state = state;
		this.city = city;
		this.country = country;
	}



public ZipCode() {
	
}
}