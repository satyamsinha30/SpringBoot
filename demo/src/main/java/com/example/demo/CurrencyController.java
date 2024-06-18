package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {
	@Autowired
	private CurrencyServiceConfiguration conf;
	@RequestMapping("/currency")
	public CurrencyServiceConfiguration retrieveAll(){
		return conf;
	}
}
