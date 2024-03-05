package com.itbank.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.itbank.model.RoomDTO;
import com.itbank.repository.ChatRoomRepository;

@Controller
@RequestMapping("/chat")
public class ChatController {
	
	@Autowired
	private ChatRoomRepository repository;
	Set<String> userList = new HashSet<String>();
	
	@GetMapping("/rooms")
	public ModelAndView rooms(String username, HttpSession session) {
		ModelAndView mav = new ModelAndView();
		if(username != null) {
			session.setAttribute("username", username);
			userList.add(username);
		}
		mav.addObject("userList", userList);
		return mav;
	}
	@PostMapping("/rooms")
	public String create(String name, RedirectAttributes rttr) {
		RoomDTO room = repository.createChatRoom(name);
		
		return name;
	}
		
	
	
}
