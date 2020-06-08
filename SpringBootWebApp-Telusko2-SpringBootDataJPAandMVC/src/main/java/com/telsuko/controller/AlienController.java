package com.telsuko.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.telsuko.Repositiy_DAO.AlienRepo_DAO;
import com.telsuko.model.Alien;

@Controller
public class AlienController {
	@Autowired
	AlienRepo_DAO repo;
	
	
	@RequestMapping("/home")
	public String showHome()
	{
		return "home";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) // what ever data comes from client will automatically be assigned here
	{
		repo.save(alien);
		return "home";
	}
	
	

	@RequestMapping("/searchById")
	public ModelAndView searchObject(@RequestParam int aid)
	{
		
		Alien alien =  repo.findById(aid).orElse(new Alien());
		List<Alien> aliens = new ArrayList<Alien>();
		aliens.add(alien);
		ModelAndView mv = new ModelAndView("showAliens");
		mv.addObject("aliens", aliens);
		return mv;
	}

	@RequestMapping("/fetchAllData")
	public ModelAndView fetchAllObject(Alien alien)
	{
		List<Alien> aliens = (List<Alien>) repo.findAll();
		ModelAndView mv = new ModelAndView("showAliens");
		mv.addObject("aliens", aliens);
		
		return mv;
	}
	
	@RequestMapping("/searchByTech")
	public ModelAndView findByTech(@RequestParam String tech)
	{
		List<Alien> aliens = repo.findByTech(tech);
		ModelAndView mv = new ModelAndView("showAliens");
		mv.addObject("aliens", aliens);
		return mv;
	}
	
	@RequestMapping("/searchByTechSortByName")
	public ModelAndView findByTechSortByName(@RequestParam String tech)
	{
		List<Alien> aliens = repo.findByTechSortByName(tech);
		ModelAndView mv = new ModelAndView("showAliens");
		mv.addObject("aliens", aliens);
		return mv;
	}
	
	@RequestMapping("/searchByIDGreaterThan")
	public ModelAndView gt(@RequestParam int aid)
	{
		ModelAndView mv = new ModelAndView("showAliens");
		List<Alien> aliens = repo.findByAidGreaterThan(aid);
		mv.addObject("aliens", aliens);
		
		return mv;
	}
	
	@RequestMapping("/searchByIdLessThan")
	public ModelAndView lt(@RequestParam int aid)
	{
		ModelAndView mv = new ModelAndView("showAliens");
		List<Alien> aliens = repo.findByAidLessThan(aid);
		mv.addObject("aliens", aliens);
		
		return mv;
	}
}
