package com.sreenutech.beans;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonPropertyOrder({ "f_name", "l_name", "e_mail" })
//@JsonInclude(value=Include.NON_EMPTY)
public class Customer {

	private String fname;
	@JsonProperty("l_name")
	private String lname;
	// @JsonProperty("e_mail")
	private String email;
	@JsonSerialize(using=DateSerializer.class)
	private Date date;
	private long mobNumber;
	private List<String> address;
	private Orders orders;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	private Accout acc;

	public Accout getAcc() {
		return acc;
	}

	public void setAcc(Accout acc) {
		this.acc = acc;
	}

	public String getFname() {
		return fname;
	}

	//@JsonProperty("f_name")
	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}
	//@JsonProperty("l_name")
	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(long mobNumber) {
		this.mobNumber = mobNumber;
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", email=" + email + ", date=" + date + ", mobNumber="
				+ mobNumber + ", address=" + address + ", orders=" + orders + ", acc=" + acc + "]";
	}

}
