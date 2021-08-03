package com.selva.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("cokeSlogan")
public class CokeSloganGenerator implements SloganService {

	@Override
	public String generateSlogan() {
		// TODO Auto-generated method stub
		return "Open Happiness";
	}

}
