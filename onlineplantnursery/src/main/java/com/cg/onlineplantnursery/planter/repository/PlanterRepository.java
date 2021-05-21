package com.cg.onlineplantnursery.planter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlineplantnursery.planter.entity.Planter;

public interface PlanterRepository extends JpaRepository<Planter, Integer> , IPlanterRepository {

}
