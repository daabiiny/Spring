package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.ReviewDTO;
import com.itbank.service.ReviewService;

@Controller
@RequestMapping("/review")
public class ReviewController {

	@Autowired private ReviewService reviewservice;
	
	@GetMapping("/list")
	public ModelAndView getReviewList() {
		ModelAndView mav = new ModelAndView();
		List<ReviewDTO> list = reviewservice.getReviewList();
		mav.addObject("list", list);
		return mav;
	}
	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public String write(ReviewDTO dto) {
		int row = reviewservice.reviewWrite(dto);
		System.out.println(row != 0 ? "작성 성공" : "작성 실패");
		return "redirect:/review/list";
	}
	@GetMapping("/view/{idx}")
	public ModelAndView view(@PathVariable("idx") int idx) {
		ModelAndView mav = new ModelAndView("/review/view");
		ReviewDTO dto = reviewservice.getReview(idx);
		mav.addObject("dto", dto);
		return mav;
	}
	@GetMapping("/delete/{idx}")
	public String delete(@PathVariable("idx") int idx) {
		int row = reviewservice.delete(idx);
		System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
		return "redirect:/review/list";
	}
	
}
