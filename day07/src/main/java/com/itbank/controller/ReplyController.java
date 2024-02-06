package com.itbank.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.model.ReplyDTO;
import com.itbank.service.ReplyService;

@Controller
@RequestMapping("/reply")
public class ReplyController {

	@Autowired private ReplyService replyservice;
	
	@GetMapping("/choice")
	public void insert() {}
	
	@PostMapping("/choice")
	public String insert(ReplyDTO dto) {
		int row = replyservice.insert(dto);
		System.out.println(row != 0 ? "설문 완료" : "설문 실패");
		return "redirect:/survey/view";
	}
	
}