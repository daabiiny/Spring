package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itbank.model.SalesDTO;

@Repository
public interface SalesDAO {
	
	@Select("select * from sales order by idx")
	List<SalesDTO> selectList();

}
