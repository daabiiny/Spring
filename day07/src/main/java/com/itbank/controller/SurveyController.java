package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.SurveyDTO;
import com.itbank.service.SurveyService;

@Controller
@RequestMapping("/survey")
public class SurveyController {

	@Autowired private SurveyService surveyservice;
	
	@GetMapping("list")
	public ModelAndView surveyList() {
		ModelAndView mav = new ModelAndView();
		List<SurveyDTO> list = surveyservice.getSurveyList();
		mav.addObject("list", list);
		return mav;
	}
	
	
}
