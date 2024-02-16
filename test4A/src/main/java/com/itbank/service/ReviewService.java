package com.itbank.service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.ReviewDTO;
import com.itbank.repository.ReviewDAO;

@Service
public class ReviewService {

	@Autowired private ReviewDAO dao;
	private String saveDirectory = "C:\\upload";
	
	public List<ReviewDTO> getReviewList() {
		return dao.selectList();
	}
	public int reviewWrite(ReviewDTO dto) {
		String original = dto.getUpload().getOriginalFilename();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss_");
		String dateName = sdf.format(date);
		String img = dateName + original;
		
		File f = new File(saveDirectory, img);
		try {
			dto.getUpload().transferTo(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dto.setImg(img);
		return dao.addReview(dto);
	}
	public ReviewDTO getReview(int idx) {
		return dao.selectOne(idx);
	}

	public int delete(int idx) {
		String fileName = dao.getFileName(idx);
		File f = new File(saveDirectory, fileName);
		if(f.exists()) {
			f.delete();
		}
		return dao.delete(idx);
	}


}
