package com.itbank.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.itbank.model.MessageDTO;

@Controller
//@MessageMapping("/app") 이 붙어있다고 생각해! (servlet-context에 적어둠)
public class StompController {

	@MessageMapping("/enter/{roomId}")	// 들어오는 주소
	@SendTo("/broker/room/{roomId}")	// 브로커에게 보내는 주소 (브로커가 다시 클라이언트에게 보낸다)
	public MessageDTO enter(MessageDTO message) {
		message.setText(message.getFrom() + "님이 채팅방에 참여하였습니다");
		message.setFrom("service");
		return message;
	}
	@MessageMapping("/message/{roomId}")
	@SendTo("/broker/room/{roomId}")	// 브로커한테 간다! -> 그러면 해당채널을 구독하는 사람한테만 브로커가 전송
	public MessageDTO message(MessageDTO message) {
		return message;
	}
	
	@MessageMapping("/disconnect/{roomId}")
	@SendTo("/broker/room/{roomId}")
	public MessageDTO disconnect(MessageDTO message) {
		message.setText(message.getFrom() + "님이 채팅방을 나갔습니다");
		message.setFrom("service");
		return message;
	}
	
	
}
