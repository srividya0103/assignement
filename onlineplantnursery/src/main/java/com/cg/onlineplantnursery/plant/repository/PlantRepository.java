package com.cg.onlineplantnursery.plant.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlineplantnursery.plant.entity.Plant;

public interface PlantRepository extends JpaRepository<Plant, Integer> , IPlantRepository  {

}
