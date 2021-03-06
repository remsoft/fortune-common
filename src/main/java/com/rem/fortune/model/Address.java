package com.rem.fortune.model;

public class Address {
	private int id;
	private String street;
	private String city;
	private String state;
	private String zip;
	private String country;
	private String attention;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAttention() {
		return attention;
	}
	public void setAttention(String attention) {
		this.attention = attention;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", country=" + country + ", attention=" + attention + ", getId()=" + getId() + ", getStreet()="
				+ getStreet() + ", getCity()=" + getCity() + ", getState()=" + getState() + ", getZip()=" + getZip()
				+ ", getCountry()=" + getCountry() + ", getAttention()=" + getAttention() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
