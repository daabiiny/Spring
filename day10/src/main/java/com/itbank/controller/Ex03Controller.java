package com.itbank.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class Ex03Controller {
//	@RequestBody : 요청에 담긴 내용이 파라미터로 그대로 사용된다
//	@ResponseBody : 반환하는 내용 그 자체가 응답이다
	
	private ObjectMapper objectMapper = new ObjectMapper();	// jackson-databind
	
	@GetMapping("/ex03")
	public void ex03(){}
	
//	@PostMapping("/ex03Ajax")
//	@ResponseBody
//	public HashMap<String, Object> ex03Ajax(@RequestBody HashMap<String, Object> param){
//		System.out.println("userid : " + param.get("userid"));
//		HashMap<String, Object> map = new HashMap<>();
//		int count = service.checkDuplicate(param);
//		map.put("count", count);
//		map.put("msg", count == 1 ? "이미 사용중인 아이디입니다" : "사용가능합니다");
//		String result = objectMapper.writeValueAsString(map);
//		본래는 자바 객체를 JSON 규칙에 맞춰 문자열로 변환한 다음 반환해야 하지만, ObjectMapper가 자동으로 변환을 처리한다
//		return map;
//	}
	
}
