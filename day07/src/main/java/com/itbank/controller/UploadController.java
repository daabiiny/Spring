package com.itbank.controller;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.itbank.model.SurveyDTO;
import com.itbank.service.UploadService;

@Controller
@RequestMapping("/survey")
public class UploadController {
	
	@Autowired private UploadService service;
	
	public UploadController() {
		File dir = new File("C:\\upload");
		if(dir.exists() == false) {
			dir.mkdirs();
		}
	}
	@GetMapping("/write")
	public void write() {}
	
	@PostMapping("/write")
	public String write(SurveyDTO dto) {
		int row = service.upload(dto);
		System.out.println(row != 0 ? "등록 성공" : "등록 실패");
		return "redirect:/survey/list";
	}
	
	
	
}
