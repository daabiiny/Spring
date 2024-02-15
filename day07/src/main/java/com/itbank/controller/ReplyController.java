package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.SurveyDTO;
import com.itbank.service.ReplyService;

@Controller
@RequestMapping("/reply")
public class ReplyController {

	@Autowired private ReplyService replyservice;
	

	@GetMapping("/result")
	public ModelAndView resultList() {
		ModelAndView mav = new ModelAndView();
		List<SurveyDTO> list = replyservice.resultList();
		mav.addObject("list", list);
		return mav;
	}

	
}
