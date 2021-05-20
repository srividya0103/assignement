package com.abc.brokerage.service;
import java.util.List;

import com.abc.brokerage.bean.Stock;
import com.abc.brokerage.bean.Trans;

public interface TransService {

	
	public List<Trans> getAllTrans();
	public Trans saveTrans(Trans t);
	
	public Trans getTransById(int id);
	
	
}
