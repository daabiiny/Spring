package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.mcdonald.McdonaldDTO;
import com.itbank.repository.McdonaldDAO;

enum McdonaldCategory {
	   all(null),
	   burger("버거"),
	   drink("음료");
	   
	   private String columnValue;
	   
	   McdonaldCategory(String columnValue){
	      this.columnValue = columnValue;
	   }
	   public String getColumnName() {
	      return columnValue;
	   }
	}

@Service
public class McdonaldService {

	@Autowired private McdonaldDAO dao;
	
//	public List<McdonaldDTO> getMcdonaldList() {
//		List<McdonaldDTO> list = dao.selectList();
//		return list;
//	}
	public List<McdonaldDTO> getList(String category){
		String columnValue = null;
		switch(category) {
		case "all":		columnValue = null;		break;
		case "burger":	columnValue = "버거";		break;
		case "drink":	columnValue = "음료";		break;
		}
		McdonaldCategory e1 = McdonaldCategory.valueOf(category);
		columnValue = e1.getColumnName();
		
		return dao.selectListCategory(columnValue);
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
