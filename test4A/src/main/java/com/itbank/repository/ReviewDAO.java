package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.itbank.model.ReviewDTO;

public interface ReviewDAO {
	
	@Select("select * from review order by idx")
	List<ReviewDTO> selectList();
	
	@Insert("insert into review (title, img, writer, content)"
			+ " values (#{title}, #{img}, #{writer}, #{content})")
	int addReview(ReviewDTO dto);
	
	@Select("select * from review where idx = #{idx}")
	ReviewDTO selectOne(int idx);
	
	@Delete("delete from review where idx = #{idx}")
	int delete(int idx);
	
	@Select("select img from review where idx = #{idx}")
	String getFileName(int idx);
	

}
