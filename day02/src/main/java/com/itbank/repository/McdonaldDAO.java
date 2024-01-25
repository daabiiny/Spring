package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.itbank.mcdonald.McdonaldDTO;

public interface McdonaldDAO {

//	@Select("select * from mcdonald")
//	List<McdonaldDTO> selectList();
	
	@Insert("insert into mcdonald (category, name, price, imgName, memo)"
			+ " values ( #{category}, #{name}, #{price}, #{imgName}, #{memo} )")
	int insertMcdonald(McdonaldDTO dto);
	
	@Select("select * from mcdonald where idx = #{idx}")
	McdonaldDTO selectOne(int idx);

	@Delete("delete from mcdonald where idx = #{idx}")
	int deleteMcdonald(int idx);

	
	@Select("<script>"
			+ "select * from mcdonald "
			+ " <if test=\"category != null\">"
			+ "		where category = #{category}"
			+ " </if>"
			+ " order by idx"
			+ "</script>")
	List<McdonaldDTO> selectListCategory(String columnValue);
	
	
	List<McdonaldDTO> selectList(String category);
	
}
