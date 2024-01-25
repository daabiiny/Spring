package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.mcdonald.McdonaldDTO;
import com.itbank.repository.McdonaldDAO;

@Service
public class McdonaldService {

	@Autowired private McdonaldDAO dao;
	
	public List<McdonaldDTO> getMcdonaldList() {
		List<McdonaldDTO> list = dao.selectList();
		return list;
	}

	public int add(McdonaldDTO dto) {
		int row = dao.insertMcdonald(dto);
		return row;
	}

	public McdonaldDTO getSelectOne(int idx) {
		return dao.selectOne(idx);
	}

	public int delete(int idx) {
		return dao.deleteMcdonald(idx);
	}

}
