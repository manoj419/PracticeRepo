package com.sreenutech.beans;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
@JsonIgnoreType
public class Orders {
	List<Order> list_Order=new ArrayList<Order>();

	public List<Order> getList_Order() {
		return list_Order;
	}

	public void setList_Order(List<Order> list_Order) {
		this.list_Order = list_Order;
	}

	@Override
	public String toString() {
		return "Orders [list_Order=" + list_Order + "]";
	}
	
	
}
