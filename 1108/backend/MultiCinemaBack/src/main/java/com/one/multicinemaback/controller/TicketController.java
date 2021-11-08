package com.one.multicinemaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.TicketDto;
import com.one.multicinemaback.dto.UserDto;
import com.one.multicinemaback.service.TicketService;

@RestController
public class TicketController {
	
	@Autowired
	TicketService service;
	
	@RequestMapping(value = "/infoUser", method = RequestMethod.POST)
	public UserDto infoUser(String id) {
		System.out.println("TicketController infoUser()");
		UserDto data = service.infoUser(id);
		
		return data;
	}
	
	
	// 개인정보 수정
	@RequestMapping(value = "/upUser", method = RequestMethod.GET)
	public String upUser(UserDto user){
		System.out.println("TicketController upUser()");
		
		boolean b = service.upUser(user);
		if(b == true) {
			return "OK";
		}else {
			return "NG";
		}
	}
	
	// 티켓 리스트
	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public List<TicketDto> mypage(String id) {
		System.out.println("TicketController mypage()");
		
		List<TicketDto> list = service.mypage(id);
		return list;
	}
	
}
