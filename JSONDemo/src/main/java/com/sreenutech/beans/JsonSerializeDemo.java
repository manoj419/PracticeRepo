package com.sreenutech.beans;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSerializeDemo {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();

		Customer customer = new Customer();
		customer.setFname("manoj");
		customer.setLname("reddy");
		customer.setMobNumber(9666054958l);
		customer.setEmail("manojreddybala@gmail.com");

		List<String> list_address = new ArrayList<String>();
		list_address.add("SR Nagar");
		list_address.add("ameerpet");
		list_address.add("Guntur");
		customer.setAddress(list_address);
		Orders orders = new Orders();

		Order order = new Order();
		order.setOid(1234);
		order.setName("moblie");
		order.setDesc("good");
		order.setStatus("delivered");
		orders.list_Order.add(order);

		Order order1 = new Order();
		order1.setOid(1879);
		order1.setName("moblie");
		order1.setDesc("good");
		order1.setStatus("not delivered");
		orders.list_Order.add(order1);

		Order order2 = new Order();
		order2.setOid(4576);
		order2.setName("camera");
		order2.setDesc("good");
		order2.setStatus("delivered");
		orders.list_Order.add(order2);

		customer.setOrders(orders);

		Accout acc = new Accout();
		acc.setNumber(12457864);
		acc.setBalance(10000d);
		customer.setAcc(acc);
		
		customer.setDate(new java.util.Date());
		String cust = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customer);
		System.out.println(cust);
		//mapper.writerWithDefaultPrettyPrinter().writeValue(new File("G:/json/JSONDemo/src/main/resources/orders.json"), customer);
	
		
		
	}

}
