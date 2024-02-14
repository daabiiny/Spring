package com.itbank.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.itbank.model.MemberDTO;
import com.itbank.service.MemberService;

@RestController	// 문서 내용을 응답하지 않고, 순수 데이터를 응답하기 위한 AJAX 전용 컨트롤러
				// 모든 함수에 자동으로  @ResponseBody가 적용된다 (포워드 및 리다이렉트가 기본값이 아니다)
public class AjaxController {
	
	@Autowired private MemberService service;
	
	// 데이터 전달
	// AJAX요청에 대응하는 컨트롤러 함수는 기본자료형, 배열, 리스트, 맵, DTO 등 여러 타입을 변환할 수 있다
	// 반환값이  viewName이 아니라, 반환값(n1 + n2)이 응답 그 자체임을 명시해야 한다 (그래서 @ResponseBody넣어야함)
	// 이러면 JSP로 포워딩 안함!
	@GetMapping("/ex01Ajax")
	public int ex01Ajax(int n1, int n2) {
		return n1 + n2;
	}
	
	@PostMapping("/ex03Ajax")
	public HashMap<String, Object> ex03Ajax(@RequestBody HashMap<String, Object> param){
		System.out.println("userid : " + param.get("userid"));
		HashMap<String, Object> map = new HashMap<>();
		int count = service.checkDuplicate(param);
		map.put("count", count);
		map.put("msg", count == 1 ? "이미 사용중인 아이디입니다" : "사용가능합니다");
//		String result = objectMapper.writeValueAsString(map);
//		본래는 자바 객체를 JSON 규칙에 맞춰 문자열로 변환한 다음 반환해야 하지만, ObjectMapper가 자동으로 변환을 처리한다
		return map;
	}
	@GetMapping("/ex04Ajax")
	public List<MemberDTO> ex04Ajax(){
		return service.getMemberList();
	}
	
}
