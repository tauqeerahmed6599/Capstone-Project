package com.demo.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.placement.domain.Placement;

public interface PlacementRepository extends JpaRepository<Placement,Long>{

}
