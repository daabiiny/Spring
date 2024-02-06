package com.itbank.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.ReplyDTO;
import com.itbank.repository.ReplyDAO;

@Service
public class ReplyService {
	
	@Autowired private ReplyDAO dao;
	
	public int insert(ReplyDTO dto) {
		return dao.insert(dto);
	}

}
