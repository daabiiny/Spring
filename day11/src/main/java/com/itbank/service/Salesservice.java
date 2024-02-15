package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.model.SalesDTO;
import com.itbank.repository.SalesDAO;

@Service
public class Salesservice {

	@Autowired private SalesDAO dao;
	
	public List<SalesDTO> getSalesList() {
		return dao.selectList();
	}

}
