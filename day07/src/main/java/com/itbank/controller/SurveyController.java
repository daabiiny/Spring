package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.SurveyDTO;
import com.itbank.service.SurveyService;

@Controller
@RequestMapping("/survey")
public class SurveyController {

	@Autowired private SurveyService surveyservice;
	
	@GetMapping("/list")
	public ModelAndView surveyList() {
		ModelAndView mav = new ModelAndView();
		List<SurveyDTO> list = surveyservice.getSurveyList();
		mav.addObject("list", list);
		return mav;
	}
	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public String write(SurveyDTO dto) {
		int row = surveyservice.write(dto);
		System.out.println(row != 0 ? "등록 성공" : "등록 실패");
		return "redirect:/survey/list";
	}
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("/survey/view");
		SurveyDTO dto = surveyservice.getSurvey(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	
}
