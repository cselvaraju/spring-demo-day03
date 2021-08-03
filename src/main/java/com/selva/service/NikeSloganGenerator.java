package com.selva.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("nikeSlogan")
public class NikeSloganGenerator implements SloganService {

	@Override
	public String generateSlogan() {
		// TODO Auto-generated method stub
		return "Just Do It";
	}

}
