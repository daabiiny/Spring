package com.itbank.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.SurveyDTO;
import com.itbank.repository.SurveyDAO;

@Service
public class SurveyService {

	@Autowired private SurveyDAO dao;
	private String saveDirectory = "C:\\upload";
	
	public List<SurveyDTO> getSurveyList() {
		return dao.selectList();
	}

	public int write(SurveyDTO dto) {
		String imageA = dto.getUploadA().getOriginalFilename();
		String imageB = dto.getUploadB().getOriginalFilename();
		
		File f1 = new File(saveDirectory, imageA);
		File f2 = new File(saveDirectory, imageB);
		
		try {
			dto.getUploadA().transferTo(f1);
			dto.getUploadB().transferTo(f2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dto.setImageA(imageA);
		dto.setImageB(imageB);
		
		return dao.insert(dto);
	}
	
}
