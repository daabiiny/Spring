package com.itbank.service;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class Ex01Service {
	// 공공데이터포털, 부산 축제 정보
	
	private final String serviceKey = "xIi2xer0YCKS8xCDwZRMYqra1GizNXGZVov2yhjwfctp02IU1bubA18cLhTwUfxsenjFqg2UylLvZvz%2F4tRovQ%3D%3D";
	
	public String getFestivalJson() throws MalformedURLException, IOException {
		// 1) 요청 주소 및 파라미터 준비
		String url = "https://apis.data.go.kr/6260000/FestivalService/getFestivalKr";
		HashMap<String, String> param = new HashMap<>();
		param.put("pageNo", "1");
		param.put("numOfRows", "10");
		param.put("resultType", "json");
		param.put("serviceKey", serviceKey);
		url += "?";
		for(String key : param.keySet()) {
			url += key + "=" + param.get(key) + "&"; // key=value&key=value ... (쿼리스트링형식)
		}
		
		// 2) 요청을 전송하여 응답을 받아서 저장
		Scanner sc = null;
		String response = "";
		HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
		
		if(conn.getResponseCode() == 200) {	// 정상
			sc = new Scanner(conn.getInputStream());	// 연결된 대상을 들고 올 수 있는 inputStream을 열어!
			while(sc.hasNextLine()) {
				response += sc.nextLine();
			}
			sc.close();
			conn.disconnect();
		}
		return response;
	}
}
