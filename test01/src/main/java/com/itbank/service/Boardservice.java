package com.itbank.service;

import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.BoardDTO;
import com.itbank.repository.BoardDAO;

@Service
public class Boardservice {
	
	@Autowired private BoardDAO dao;
	private String saveDirectory = "C:\\upload";

	public List<BoardDTO> getBoardList() {
		return dao.selectList();
	}
	
	public BoardDTO getBoard(int idx) {
		return dao.selectOne(idx);
	}

	public int insert(BoardDTO dto) {
		String img = dto.getUpload().getOriginalFilename();
		File f = new File(saveDirectory, img);
		try {
			dto.getUpload().transferTo(f);
		} catch (Exception e) {
			e.printStackTrace();
		}
		dto.setImg(img);
		return dao.insert(dto);
	}

	public int update(BoardDTO dto) {
		return dao.update(dto);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}

	
	
	
}
