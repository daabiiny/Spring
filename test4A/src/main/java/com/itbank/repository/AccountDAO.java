package com.itbank.repository;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.itbank.model.AccountDTO;

@Repository
public interface AccountDAO {
	
	@Select("select * from account where userid = #{userid} and userpw = #{userpw}")
	AccountDTO login(AccountDTO dto);
	
	@Insert("insert into account (userid, userpw, username)"
			+ " values (#{userid}, #{userpw}, #{username})")
	int join(AccountDTO dto);

	
}
