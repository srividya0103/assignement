package com.abc.brokerage.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.abc.brokerage.bean.Stock;
import com.abc.brokerage.bean.Trans;

public interface TransRepository extends JpaRepository<Trans, Integer> , CustomTransRepository {

}



