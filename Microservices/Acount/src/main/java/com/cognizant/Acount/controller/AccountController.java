package com.cognizant.Acount.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
	
	@GetMapping("/accounts/{number}")
	public String account(@PathVariable long number)
	{
		return "Number:"+number+", Type:saving, Balance:100000.0";
	}

}
