package com.abc.brokerage.service;

import java.util.List;

import com.abc.brokerage.bean.Stock;
import com.abc.brokerage.bean.Trans;
import com.abc.brokerage.dao.TransRepository;

import net.bytebuddy.asm.Advice.Return;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransServiceImpl implements TransService{
	@Autowired
	TransRepository repo;

	
	

	
	@Override
	@Transactional
	public Trans saveTrans(Trans t) {
		// TODO Auto-generated method stub
		
		repo.save(t);
		return t;
	}

	
	

	
	@Override
	public Trans getTransById(int id)  {
		return repo.findById(id).get();
		
	}



	@Override
	public List<Trans> getAllTrans() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	



	




	

}