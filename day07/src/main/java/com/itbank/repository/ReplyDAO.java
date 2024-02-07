package com.itbank.repository;

import java.util.List;

import com.itbank.model.ReplyDTO;
import com.itbank.model.SurveyDTO;

public interface ReplyDAO {

	int insert(ReplyDTO dto);

	List<SurveyDTO> resultList();
	
}
