package com.cg.onlineplantnursery.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlineplantnursery.customer.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> , ICustomerRepository  {


}


