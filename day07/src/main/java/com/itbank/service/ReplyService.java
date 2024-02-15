package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.ReplyDTO;
import com.itbank.model.SurveyDTO;
import com.itbank.repository.ReplyDAO;

@Service
public class ReplyService {
	
	@Autowired private ReplyDAO dao;
	
	public int insert(ReplyDTO dto) {
		return dao.insert(dto);
	}
	public List<SurveyDTO> resultList() {
		return dao.resultList();
	}

}
