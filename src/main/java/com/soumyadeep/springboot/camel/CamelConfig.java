package com.soumyadeep.springboot.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class CamelConfig extends RouteBuilder{
	
	public void configure() throws Exception{
		
		from("file:C:\\Users\\sousaha\\Desktop\\input?noop=true").to("file:C:\\Users\\sousaha\\Desktop\\output");
	}
}
