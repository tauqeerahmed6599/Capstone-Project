package com.demo.placement.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demo.placement.domain.Placement;
import com.demo.placement.service.PlacementService;

@RestController
public class PlacementController {
	@Autowired
	private PlacementService service;
	@GetMapping("/placement")
	public List<Placement> viewData()
	{
		return service.listAll();	
	}

	@GetMapping("/placement/{id}")
 	public Placement getTask(@PathVariable int id)
	{
		return service.get(id);	
	}
	
	@PutMapping(value="/placement/{id}")
	public ResponseEntity<?> editPlacementPage(@RequestBody Placement newtask, @PathVariable int id) {
		try {
			Placement existingtask= service.get(id);
			existingtask.setType(newtask.getType());
			existingtask.setVacancy(newtask.getVacancy());
			existingtask.setDescription(newtask.getDescription());
			
			
			service.save(existingtask);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(Exception exp) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/placement")
	public void add(@RequestBody Placement  task)
	{
		service.save(task);
	}
	
	@DeleteMapping("/placement/{id}")
	public void delete(@PathVariable int id)
	{
		service.delete(id);
	}
}
