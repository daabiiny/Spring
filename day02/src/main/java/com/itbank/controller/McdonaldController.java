package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.mcdonald.McdonaldDTO;
import com.itbank.service.McdonaldService;

@Controller
public class McdonaldController {
	
	@Autowired private McdonaldService ms;
	
	@GetMapping("/mcdonald")
	public ModelAndView mcdonaldList() {
		ModelAndView mav = new ModelAndView("mcdonald-list");
		List<McdonaldDTO> list = ms.getMcdonaldList();
		mav.addObject("list", list);
		return mav;
	}
	@GetMapping("/mcdonald/add")
	public ModelAndView mcdonaldAdd() {
		ModelAndView mav = new ModelAndView("mcdonald-add");
		return mav;
	}
	@PostMapping("/mcdonald/add")
	public ModelAndView mcdonaldAdd(McdonaldDTO dto) {
		ModelAndView mav = new ModelAndView("redirect:/mcdonald");
		int row = ms.add(dto);
		System.out.println(row != 0 ? "추가 성공" : "추가 실패");
		return mav;
	}
	@GetMapping("/view/{idx}")
	public ModelAndView mcdonaldview(@PathVariable("idx")int idx) {
		ModelAndView mav = new ModelAndView("view");
		McdonaldDTO dto = ms.getSelectOne(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	@GetMapping("/delete/{idx}")
	public ModelAndView mcdonaldDelete(@PathVariable("idx")int idx) {
		ModelAndView mav = new ModelAndView("delete");
		int row = ms.delete(idx);
		
		String message = row != 0 ? "삭제 성공" : "삭제 성공";
		String url = "/mcdonald";
		
		mav.addObject("message", message);
		mav.addObject("url", url);
		
		return mav;
	}
	
	
}
