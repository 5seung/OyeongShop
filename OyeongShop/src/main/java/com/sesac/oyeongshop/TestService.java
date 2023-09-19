package com.sesac.oyeongshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
	
	@Autowired
	TestDao dao;
	
	public int testInsert() {
		return dao.insert();
	}

}
