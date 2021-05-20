package com.abc.brokerage.service;

import java.util.List;

import com.abc.brokerage.bean.Stock;


public interface StockService {
	public List<Stock> getAllStocks();
	public Stock saveStocks(Stock t);
		public Stock getStocksById(int id);
		public void updateStock(Stock p,int id,int q, String s);
		
}
