package com.abc.brokerage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.brokerage.bean.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> , CustomStockRepository  {

}
