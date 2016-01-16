package com.mealtime.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mealtime.bean.UserMaster;
import com.mealtime.service.MealTimeService;

@Controller
public class MealTimeBaseController {
	
	@Autowired
	MealTimeService mealTimeService;
	
	@RequestMapping("/home")
	public ModelAndView renderHomePage(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/profile")
	public ModelAndView renderProfilePage(){
		ModelAndView mv = new ModelAndView();
		mv.addObject("buttonName","Submit");
		mv.addObject("user", new UserMaster());
		mv.setViewName("profile");
		return mv;
	}
	
	@RequestMapping(value="/saveProfile", method=RequestMethod.POST)
	public ModelAndView saveProfile(@ModelAttribute("user") UserMaster userMaster, BindingResult result){
		System.out.println("In MealTimeBaseController :: saveProfile()");
		String message = "Profile Updated Succesfully";
		ModelAndView mv = new ModelAndView();
		UserMaster user = mealTimeService.saveProfile(userMaster);
		mv.addObject("user",user);
		mv.setViewName("profile");
		mv.addObject("buttonName","Update");
		mv.addObject("message", message);
		return mv;
	}

}
