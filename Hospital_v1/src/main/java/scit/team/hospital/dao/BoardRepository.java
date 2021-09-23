package scit.team.hospital.dao;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import scit.team.hospital.vo.BoardVO;

@Repository
public class BoardRepository {

	@Autowired
	SqlSession session;
	
	public int insert(BoardVO board) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		int result = 0;
		
		try {
			result = mapper.insertBoard(board);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	/**
	 * 모든 게시글을 조회
	 * @param erow 
	 * @param srow 
	 * @param searchWord 
	 * @param searchItem 
	 * @return 게시글 전체 목록
	 */
	public List<BoardVO> selectAll(int srow, int erow, String searchItem, String searchWord, String boardtype) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		Map<String, Object> search = new HashMap<>();
		
		search.put("searchItem", searchItem);
		search.put("searchWord", searchWord);
		search.put("srow", srow);
		search.put("erow", erow);
		search.put("boardtype", boardtype);
		
		List<BoardVO> list = null;
		try {
			list = mapper.selectBoard(search);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	/**
	 * 글 하나 조회(boardnum)
	 * @param boardnum
	 * @return DB에서 가져온 글 한개의 정보(Board)
	 */
	public BoardVO selectOne(int boardnum) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		
		BoardVO board = null;
				
		try {
			board = mapper.selectOne(boardnum);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return board;
	}
	
	public int delete(int boardnum) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = 0;
		
		try {
			result = mapper.deleteBoard(boardnum);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	public int update(BoardVO board) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = 0;
		
		try {
			result = mapper.updateBoard(board);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	public int getBoardCount(String searchItem, String searchWord, String boardtype) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		Map<String, String> search = new HashMap<String, String>();	
		
		search.put("searchItem", searchItem);
		search.put("searchWord", searchWord);
		search.put("boardtype", boardtype);
		
		int totlaRecordCount = 0;
		
		try {
			totlaRecordCount = mapper.getBoardCount(search);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return totlaRecordCount;
	}
	public int updateHitCount(int boardnum) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = 0;				
		try {
			result = mapper.updateHitCount(boardnum);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return result;
	}
	public int replyCountUpdate(int boardnum) {
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		int result = 0;				
		try {
			result = mapper.updateReplyCount(boardnum);
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
		return result;
	}
	
}