package com.sesac.oyeongshop.review;
import java.util.List;

import com.sesac.oyeongshop.dto.ReviewDTO;

public interface ReviewDAO {
	public List<ReviewDTO> selectAll();
	public List<ReviewDTO> selectAll(String userId);
	public List<ReviewDTO> selectAll(int productNo);
	List<Integer> writeCheck(String userId);
	
}
