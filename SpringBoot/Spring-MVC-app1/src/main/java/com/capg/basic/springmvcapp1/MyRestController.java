package com.capg.basic.springmvcapp1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MyRestController {
	
	@Autowired
	ProductDAOImpl dao;
	
	@GetMapping("/hello")
	public String sayHello()
	{
		return "Hello";
	}
    
	//            localhost:9090:\product\10000\40000
	//  endpoint :- www.abc.com\product\10000\40000
	@GetMapping("/productByRating/{rating1}/{rating2}")
	public List<Product> getProductsbyrange(@PathVariable int rating1 ,@PathVariable int rating2)
	{
		return dao.getProductsByRating(rating1, rating2);
	}
	
	// ..../product/101
	@GetMapping("/productById/{searchid}")
	public Product getProductByid(@PathVariable int searchid)
	{
		return dao.getProductById(searchid);
	}
	@GetMapping("/productByName/{searchName}")
	public Product getProductByName(@PathVariable int searchName)
	{
		return dao.getProductById(searchName);
	}
	
	@GetMapping("/productDeleteById/{searchid}")
	public List<Product> deleteProductById(int searchid)
	
	{
		return dao.deleteProductById(searchid);
	}
	
}
