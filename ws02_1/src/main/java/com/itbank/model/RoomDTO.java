package com.itbank.model;

import java.util.HashSet;
import java.util.Set;

import org.springframework.web.socket.WebSocketSession;

// 채팅방

public class RoomDTO {
	
	private String roomId;
	private String name;
	private Set<WebSocketSession> sessions = new HashSet<>();
	
	public static RoomDTO create(String name) {
		RoomDTO room = new RoomDTO();
		room.roomId = name;
		return room;
	}
	
	@Override
	public String toString() {
		String form = "%s] %s";
		return String.format(form, roomId, sessions);
	}
	
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<WebSocketSession> getSessions() {
		return sessions;
	}
	public void setSessions(Set<WebSocketSession> sessions) {
		this.sessions = sessions;
	}

	
}
