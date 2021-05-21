package com.cg.onlineplantnursery.seed.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.onlineplantnursery.seed.entity.Seed;

public interface SeedRepository extends JpaRepository<Seed, Integer> , ISeedRepository {

}
