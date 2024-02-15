package com.itbank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itbank.model.SalesDTO;
import com.itbank.service.ProductService;
import com.itbank.service.Salesservice;

@Controller
@RequestMapping("/sales")
public class SalesController {
	
	@Autowired private ProductService productservice;
	@Autowired private Salesservice salesservice;
	
	@GetMapping("/list")
	public ModelAndView salesList() {
		ModelAndView mav = new ModelAndView();
		List<SalesDTO> list = salesservice.getSalesList();
		mav.addObject("list", list);
		return mav;
	}
}
