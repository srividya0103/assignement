package com.abc.brokerage.bean;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Trans {
	@Id
	int transactionId;

	int quantity;
	String transactionType;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "stockId", referencedColumnName = "stockId")
	Stock stock;

	public Trans() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Trans(int transactionId, int quantity, String transactionType) {
		super();
		this.transactionId = transactionId;
		this.quantity = quantity;
		this.transactionType = transactionType;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public int getQuantity() {
		return quantity;
	}
	

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + quantity;
		result = prime * result + transactionId;
		result = prime * result + ((transactionType == null) ? 0 : transactionType.hashCode());
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
		Trans other = (Trans) obj;
		if (quantity != other.quantity)
			return false;
		if (transactionId != other.transactionId)
			return false;
		if (transactionType == null) {
			if (other.transactionType != null)
				return false;
		} else if (!transactionType.equals(other.transactionType))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Transaction [transactionId=" + transactionId + ", quantity=" + quantity + ", transactionType="
				+ transactionType + "]";
	}

}