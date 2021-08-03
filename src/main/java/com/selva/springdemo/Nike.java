package com.selva.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.selva.service.SloganService;

@Component()
@Qualifier("nikeComponent")
@ComponentScan(basePackages = "com.selva.service")
public class Nike implements Organization {

	@Autowired
	@Qualifier("nikeSlogan")
	private SloganService sloganService;

//	// This setter will be used for SETTER INJECTION
//	public void setSloganService(SloganService sloganService) {
//		System.out.println("Injecting sloganService via SETTER");
//		this.sloganService = sloganService;
//	}

	// This constructor will be used for CONSTRUCTOR INJECTION
	public Nike(@Qualifier("nikeSlogan") SloganService sloganService) {
		System.out.println("Injecting sloganService via CONSTRUCTOR");
		this.sloganService = sloganService;
	}

	@Override
	public String slogan() {
		// TODO Auto-generated method stub
		return sloganService.generateSlogan();
	}

}
