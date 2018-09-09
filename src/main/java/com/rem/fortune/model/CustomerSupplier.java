package com.rem.fortune.model;

public class CustomerSupplier extends Model {
	private String id;
	private String name;
	private String phone;
	private String email;
	private Address address;
	private int isCustomer;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	public int getIsCustomer() {
		return isCustomer;
	}
	public void setIsCustomer(int isCustomer) {
		this.isCustomer = isCustomer;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "CustomerSupplier [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address="
				+ address.toString() + ", isCustomer=" + isCustomer + "]";
	}
	
}
