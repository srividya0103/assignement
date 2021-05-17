package com.abc.brokerage.web;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.brokerage.bean.Stock;
import com.abc.brokerage.bean.Trans;
import com.abc.brokerage.service.TransService;

@Validated
@RestController
@RequestMapping("/api")
public class StockRestController {
	
	@Autowired
	private TransService service;
	
	public StockRestController() {
		System.out.println("Stock Rest Controller Constructor");
	}
	
	@GetMapping("/home")
	public String homeRequest() {
		return "Welcome : My Stock App "+LocalDateTime.now();
	}
	
	@PostMapping("/trans")
	public Trans insertProduct(@RequestBody Trans trans) {
		service.saveTrans(trans);
		return trans;
	}
	
	@GetMapping("/trans")
	public List<Trans> getAllTrans() {
		return service.getAllTrans();
	}
	

	
	
	
	
}
