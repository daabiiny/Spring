package com.itbank.repository;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import com.itbank.model.BoardDTO;

@Repository
public interface BoardDAO {
	
	@Select("select * from board1 order by idx")
	List<BoardDTO> selectList();
	
	@Select("select * from board1 where idx = #{idx}")
	BoardDTO selectOne(int idx);
	
	@Insert("insert into board1 (title, writer, content, img)"
			+ " values ( #{title}, #{writer}, #{content}, #{img})")
	int insert(BoardDTO dto);
	
	@Update("update board1 "
			+ "set"
			+ "	title = #{title},"
			+ "	content = #{content},"
			+ "	img = #{img}"
			+ " where"
			+ "	idx = #{idx} and writer = #{writer} ")
	int update(BoardDTO dto);
	
	@Delete("delete from board1 where idx = #{idx}")
	int delete(int idx);

}
