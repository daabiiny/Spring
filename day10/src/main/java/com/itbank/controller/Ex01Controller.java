package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Ex01Controller {
	
	// 문서 전달
	// 일반적인 스프링 컨트롤러 함수는 viewName을 반환해서, JSP로 포워딩 혹은 리다이렉트 하는 것이 주 목적이다
	@GetMapping("/ex01")
	public void ex01() {}
	
	// 데이터 전달
	// AJAX요청에 대응하는 컨트롤러 함수는 기본자료형, 배열, 리스트, 맵, DTO 등 여러 타입을 변환할 수 있다
	// 반환값이  viewName이 아니라, 반환값(n1 + n2)이 응답 그 자체임을 명시해야 한다 (그래서 @ResponseBody넣어야함)
	// 이러면 JSP로 포워딩 안함!
//	@GetMapping("/ex01Ajax")
//	@ResponseBody
//	public int ex01Ajax(int n1, int n2) {
//		return n1 + n2;
//	}
}
