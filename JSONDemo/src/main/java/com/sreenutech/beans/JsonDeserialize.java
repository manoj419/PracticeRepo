package com.sreenutech.beans;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDeserialize {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper mapper=new ObjectMapper();
	Customer customer=mapper.readValue(new File("G:\\json\\JSONDemo\\src\\main\\resources\\orders.json"), Customer.class);
			System.out.println(customer);
		
	}
}
