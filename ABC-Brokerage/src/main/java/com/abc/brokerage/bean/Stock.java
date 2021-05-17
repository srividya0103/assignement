package com.abc.brokerage.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Stock {
	@Id
	int stockId;
	
	String stockName;
	int stockPrice;

	//@OneToOne(mappedBy = "stock")
	//Trans transaction1;

	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Stock(int stockId, String stockName, int stockPrice) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockPrice = stockPrice;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	

	public int getStockPrice() {
		return stockPrice;
	}

	public void setStockPrice(int stockPrice) {
		this.stockPrice = stockPrice;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stockId;
		result = prime * result + ((stockName == null) ? 0 : stockName.hashCode());
		result = prime * result + stockPrice;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Stock other = (Stock) obj;
		if (stockId != other.stockId)
			return false;
		if (stockName == null) {
			if (other.stockName != null)
				return false;
		} else if (!stockName.equals(other.stockName))
			return false;
		if (stockPrice != other.stockPrice)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Stock [stockId=" + stockId + ", stockName=" + stockName + ", stockPrice=" + stockPrice + "]";
	}

}