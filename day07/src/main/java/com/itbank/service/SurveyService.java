package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.SurveyDTO;
import com.itbank.repository.SurveyDAO;

@Service
public class SurveyService {

	@Autowired private SurveyDAO dao;
	
	public List<SurveyDTO> getSurveyList() {
		return dao.selectList();
	}

	public int write(SurveyDTO dto) {
		return dao.insert(dto);
	}

}
