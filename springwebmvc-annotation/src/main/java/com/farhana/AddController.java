package com.farhana;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {


	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int t1, 
			@RequestParam("t2") int t2) {
		
		int i = t1;
		int j = t2;
		
		int sum = i+j;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("sum",sum);
		
		return mv;
	}
	/*
	@RequestMapping("/subtract")
	public ModelAndView subtract(@RequestParam("t1") int t1, 
			@RequestParam("t2") int t2) {
		
		int i = t1;
		int j = t2;
		
		int sum = i-j;
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("sum",sum);
		
		return mv;
	}
	*/
}
