package com.example.demo.model;

public class Customer {
	
	 private int custometid;
	 private String longnumber;
	 private long phonenumber;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int custometid, String longnumber, long phonenumber) {
		super();
		this.custometid = custometid;
		this.longnumber = longnumber;
		this.phonenumber = phonenumber;
	}
	public int getCustometid() {
		return custometid;
	}
	public void setCustometid(int custometid) {
		this.custometid = custometid;
	}
	public String getLongnumber() {
		return longnumber;
	}
	public void setLongnumber(String longnumber) {
		this.longnumber = longnumber;
	}
	public long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(long phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Customer [custometid=" + custometid + ", longnumber=" + longnumber + ", phonenumber=" + phonenumber
				+ "]";
	}

}
