package com.itbank.service;

import java.io.File;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.SurveyDTO;
import com.itbank.repository.UploadDAO;

@Service
public class UploadService {

	@Autowired private UploadDAO dao;
	private String saveDirectory = "C:\\upload";
	
	public UploadService() {
		File dir = new File(saveDirectory);
		if(dir.exists() == false) {
			dir.mkdirs();
		}
	}
	public int upload(SurveyDTO dto) {
		String imageA = dto.getUploadA().getOriginalFilename();
		String imageB = dto.getUploadB().getOriginalFilename();
		
		return dao.insert(dto);
	}
