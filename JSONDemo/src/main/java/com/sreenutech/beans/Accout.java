package com.sreenutech.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@JsonIgnoreType
public class Accout {
	private int number;
	@JsonSerialize(using=BalancePatrren.class)
	private Double balance;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Accout [number=" + number + ", balance=" + balance + "]";
	}
	
}
