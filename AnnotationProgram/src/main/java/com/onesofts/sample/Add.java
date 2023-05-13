package com.onesofts.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Add {
	@GetMapping(value="/val")
	public String getAdd() {
		int age1=23;
		int age2=26;
		if(age1>age2) {
			return "Age1 is Greater";
		}
		else {
			return "Age2 is Greater";
		}
	}

}
