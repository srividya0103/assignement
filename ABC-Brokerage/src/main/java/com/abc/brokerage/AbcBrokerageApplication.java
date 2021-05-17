package com.abc.brokerage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.abc.brokerage.bean.Stock;
import com.abc.brokerage.bean.Trans;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


@SpringBootApplication
public class AbcBrokerageApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbcBrokerageApplication.class, args);
		
	


		System.out.println("All Done");
		
		
	}
}
