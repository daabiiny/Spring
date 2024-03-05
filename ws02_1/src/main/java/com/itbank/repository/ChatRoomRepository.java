package com.itbank.repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.itbank.model.RoomDTO;

@Repository
public class ChatRoomRepository {
	
	private Map<String, RoomDTO> roomMap = new LinkedHashMap<>();
	
	public List<RoomDTO> findAllRooms() {
		List<RoomDTO> result = new ArrayList<>(roomMap.values());
		Collections.reverse(result);
		return result;
	}

	public RoomDTO createChatRoom(String name) {
		
		return null;
	}

}
