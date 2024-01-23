package p4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BoardController {
	
	@Autowired private BoardDAO dao;
	
	public List<BoardDTO> getBoardList() throws Exception {
		return dao.selectList();
	}

}
