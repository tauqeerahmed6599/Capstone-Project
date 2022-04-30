package com.demo.placement.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.placement.domain.Placement;
import com.demo.placement.repository.PlacementRepository;
 

@Service

public class PlacementService {

	  @Autowired
	  private  PlacementRepository repo;
	  public List<Placement> listAll() {
	        return repo.findAll();
	    }
	  
	  public void save(Placement placement) {
		  repo.save(placement);
	  }

	public Placement get(long id) {
		return repo.findById(id).get();
			
	}

	public void delete(long id) {
	repo.deleteById(id);
		
	}
}
