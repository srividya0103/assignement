package com.abc.brokerage.web;



import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import com.abc.brokerage.service.StockService;
import com.abc.brokerage.service.TransService;

@Validated
@RestController
@RequestMapping("/api")
public class StockRestController {
	
	@Autowired
	private TransService service;
	
	@Autowired
	private StockService service1;
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
		service1.updateStock(trans.getStock(),trans.getStock().getStockId(), trans.getQuantity(),trans.getTransactionType());
		return trans;
	}
	
	
	@GetMapping("/trans")
	public List<Trans> getAllTrans() {
		return service.getAllTrans();
	}
	
	
	
	@PostMapping("/stocks")
	public Stock insertProduct(@RequestBody Stock stock) {
		service1.saveStocks(stock);
		
		return stock;
	}
	
	
	@GetMapping("/stocks")
	public List<Stock> getAllStocks() {
		return service1.getAllStocks();
	}
	
	@GetMapping("/stocks/{id}/{quantity}/{type}")
	public void updateStock(@PathVariable int id,@PathVariable int quantity, @PathVariable String type)
	{
		List<Stock> stocks = service1.getAllStocks();
		Stock s1 = null;
		for(Stock t: stocks) {
			if(t.getStockId() == id) {
				s1 = t;
			}
		}
		service1.updateStock(s1, id, quantity, type);
	}
	
	
	
}
