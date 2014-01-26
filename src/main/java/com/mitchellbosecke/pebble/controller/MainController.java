package com.mitchellbosecke.pebble.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/")
public class MainController extends BaseController{
	
	@RequestMapping
	public String getRoot(){
		return "redirect:home";
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView getHome() {
		ModelAndView mav = getMav();
		mav.setViewName("home");
		return mav;
	}
	
	@RequestMapping(value="/license", method=RequestMethod.GET)
	public ModelAndView getLicense() {
		ModelAndView mav = getMav();
		mav.setViewName("license");
		return mav;
	}
}