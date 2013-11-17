package com.mitchellbosecke.pebble.controller;

import org.springframework.web.servlet.ModelAndView;

public class BaseController {
	
	/**
	 * ModelMap with some global variables
	 */
	protected ModelAndView getMav(){		
		ModelAndView mav = new ModelAndView();
		mav.addObject("contextRoot", "pebble");
		mav.addObject("currentVersion", "0.0.2-alpha");
		return mav;
	}
}