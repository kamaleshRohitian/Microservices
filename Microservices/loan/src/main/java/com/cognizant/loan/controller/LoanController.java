package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {
	
	@GetMapping("loans/{number}")
	public String loan(@PathVariable long number)
	{
		return "Number:"+number+"\nType:car\nLoan:1000000\nEmi:2800\nTenure:32";
	}

}
