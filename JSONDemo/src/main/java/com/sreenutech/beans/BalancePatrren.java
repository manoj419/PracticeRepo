package com.sreenutech.beans;

import java.io.IOException;
import java.text.DecimalFormat;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

public class BalancePatrren extends JsonSerializer<Double>{

	@Override
	public void serialize(Double d, JsonGenerator gen, SerializerProvider serializers) throws IOException {
		DecimalFormat formatter=new DecimalFormat("#0.00000");
		gen.writeString(formatter.format(d));
		
	}

}
