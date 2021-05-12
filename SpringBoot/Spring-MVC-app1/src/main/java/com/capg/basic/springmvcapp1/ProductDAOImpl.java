package com.capg.basic.springmvcapp1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

// Manage Database

@Component
public class ProductDAOImpl {

	List<Product> list = new ArrayList<>();

	public ProductDAOImpl() {
		
		Product p1 = new Product(101, "HP-101",45000,3);
		Product p2 = new Product(102, "HP-102",15000,4);
		Product p3 = new Product(103, "HP-103",25000,1);
		Product p4 = new Product(104, "HP-104",20000,5);
		Product p5 = new Product(105, "HP-105",145000,2);
		
		list = Arrays.asList(p1,p2,p3,p4,p5);
	
	}
	
	public List<Product> getAllProducts()
	{
		return list;
	}
	
	public List<Product> getProductsByRating(int rating1,int rating2)
	{
		
		Comparator<Product> comp = (p1,p2)->p1.getProductCost() - p2.getProductCost();
		
		List<Product> productList = list.stream().
		filter((product)->product.getProductCost()>=rating1&&product.getProductCost()<=rating2).
		collect(Collectors.toList());
		
		return productList;
	}
	
	public Product getProductById(int searchid)
	{
		boolean isIdFound = false;
		Product searchedProduct = null;
		for (Product product : list) {
			if(product.getProductId() == searchid)
			{
				isIdFound = true;
				searchedProduct = product;
				break;
			}
		}
		return searchedProduct;
	}
	public Product getProductByName(String searchName)
	{
		boolean isIdFound = false;
		Product searchedProduct = null;
		for (Product product : list) {
			if(product.getProductName() == searchName)
			{
				isIdFound = true;
				searchedProduct = product;
				break;
			}
		}
		return searchedProduct;
	}
	
	public List<Product> deleteProductById(int searchid){
		Product p = null;
		ListIterator<Product> itr = list.listIterator();
		while(itr.hasNext()) {
			Product temp = itr.next();
			if(temp.getProductId() == searchid) {
			p = temp;
			}
		}
		list.remove(p);
		return list;
	}
	
	
}//end class
