package com.telsuko.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.telsuko.Repositiy_DAO.AlienRepo_DAO;
import com.telsuko.model.Alien;

@RestController // makes all the methods a REST method , they will return data either in JSON or XML form , we dont need to mention @Responsbody any more
public class RestControllers {

	@Autowired
	AlienRepo_DAO repo;
	
//	@RequestMapping("/aliens")
//	@ResponseBody //When we return String, Spring MVC thing we return a view name, to let MVC know we return data no a view name 
//	public String getAliens()
//	{
//		return repo.findAll().toString();
//	}
//	
//	@RequestMapping("/alien/{aid}")
//	@ResponseBody
//	public String getAlienByID(@PathVariable int aid)
//	{
//		return repo.findById(aid).toString();
//	}
	
	
	// to return in JSON format not String
	
	//GET
	@GetMapping("/aliens")  
	public List<Alien> getAliens() // it returns Java Object , Jacson-core jar file change Jave object to JSON formats 
	{
		return repo.findAll();
	}
	
	@GetMapping("/alien/{aid}")
	public Optional<Alien> getAlienByID(@PathVariable int aid)
	{
		return repo.findById(aid);
	}
	
	//POST
	@PostMapping("/alien")
	public Alien saveAlien(@RequestBody Alien alien) //@RequestBody provides Support if we send a raw data in JSON or XML format
	{
		repo.save(alien);
		return alien;
	}
	
	//DELETE
	@DeleteMapping("/alien/{aid}")
	public String delteAlien(@PathVariable int aid)
	{
		Alien a = repo.getOne(aid); // first fetch the object
		repo.delete(a);
		return "Deleted"; //to return the deleted object back to user to see what is being deleted
	}
	
	//PUT /Udate ,, if the id exist it will update if not it will create a new record
	@PutMapping("/alien")
	public Alien saveOrUpdate(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
}
