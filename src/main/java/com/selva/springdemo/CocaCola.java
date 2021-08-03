package com.selva.springdemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component()
@Primary
public class CocaCola implements Organization {

	@Override
	public String slogan() {
		// TODO Auto-generated method stub
		return "Open Happiness";
	}

}
