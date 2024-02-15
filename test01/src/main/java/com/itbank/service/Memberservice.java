package com.itbank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.itbank.component.HashComponent;
import com.itbank.model.MemberDTO;
import com.itbank.repository.MemberDAO;

@Service
public class Memberservice {
	
	@Autowired private MemberDAO dao;
	@Autowired private HashComponent hashComponent;
	
	public MemberDTO login(MemberDTO dto) {
//		String hash = hashComponent.getHash(dto.getUserpw());
//		dto.setUserpw(hash);
		return dao.login(dto);
	}

	public List<MemberDTO> getMemberList() {
		List<MemberDTO> list = dao.selectList();
		list.forEach(dto -> dto.setUserpw("********"));
		return list;
	}

	public int add(MemberDTO dto) {
		return dao.insert(dto);
	}

	public MemberDTO getMember(int idx) {
		return dao.selectOne(idx);
	}

	public int modify(MemberDTO dto) {
		return dao.update(dto);
	}

	public int delete(int idx) {
		return dao.delete(idx);
	}

}
