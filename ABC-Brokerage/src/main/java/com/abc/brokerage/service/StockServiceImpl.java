package com.abc.brokerage.service;

import java.util.List;

import com.abc.brokerage.bean.Stock;
import com.abc.brokerage.bean.Trans;
import com.abc.brokerage.dao.StockRepository;
import com.abc.brokerage.dao.TransRepository;

import net.bytebuddy.asm.Advice.Return;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImpl implements StockService{
	@Autowired
	StockRepository repo1;

	
	

	
	@Override
	@Transactional
	public Stock saveStocks(Stock t) {
		// TODO Auto-generated method stub
		
		repo1.save(t);
		return t;
	}

	
	

	
	@Override
	public Stock getStocksById(int id)  {
		return repo1.findById(id).get();
		
	}



	@Override
	public List<Stock> getAllStocks() {
		// TODO Auto-generated method stub
		return repo1.findAll();
	}





	
	@Override
	public void updateStock(Stock p, int id, int q, String s) {
		Optional<Stock> up = repo1.findById(id);
		int updatedPrice = 0;
		if(s.equalsIgnoreCase("buy")) {
		updatedPrice =p.getStockPrice()- ((p.getStockPrice() * (q/100) * 2)/100);
		}
		else if(s.equalsIgnoreCase("sell")) {
			updatedPrice =p.getStockPrice()+ ((p.getStockPrice() * (q/100) * 2)/100);
		}
		if(up.isPresent())
		{
			Stock stock = up.get();
			stock.setStockName(p.getStockName());
			stock.setStockPrice(updatedPrice);
			
			 repo1.save(stock);
		}
		
	}
	





	/*
	

	@Override
	public Stock updateProduct(Stock p, int id) {
		Optional<Stock> up = repo1.findById(id);
		if(up.isPresent())
		{
			Product product = up.get();
			product.setProductName(p.getProductName());
			product.setProductCost(p.getProductCost());
			product.setRating(p.getRating());
			product.setCategory(p.getCategory());
			return repo.save(product);
		}
		return null;
	}
	*/


	




	

}