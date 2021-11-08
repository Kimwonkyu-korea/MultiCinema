package com.one.multicinemaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.TicketDao;
import com.one.multicinemaback.dto.TicketDto;
import com.one.multicinemaback.dto.UserDto;

@Service
@Transactional
public class TicketService {
	
	@Autowired
	TicketDao dao;
	
	public List<TicketDto> mypage(String id){
		return dao.mypage(id);
	}
	
	public boolean upUser(UserDto user) {
		return dao.upUser(user);
	}
	
	public UserDto infoUser(String id) {
		return dao.infoUser(id);
	}
}
