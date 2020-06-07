package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.entity.Alien;

@Controller
public class ControllerClass {
	
	@RequestMapping("/home")
	public ModelAndView showHome(Alien alien)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("alien", alien);
		mv.setViewName("home");
		
		return mv;
	}
	
	@RequestMapping("/showInfo")
//	public ModelAndView showInfo(@RequestParam("name") String myName) //what if we have multiple parameters we can pass an object as whole too
	public ModelAndView showInfo(Alien alien)
	{
		ModelAndView mv = new ModelAndView();
		mv.addObject("alien", alien);
		mv.setViewName("showInfo");
		
		return mv;
	}
}
