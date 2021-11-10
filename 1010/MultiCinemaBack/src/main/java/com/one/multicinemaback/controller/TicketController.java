package com.one.multicinemaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.TicketDto;
import com.one.multicinemaback.service.TicketService;

@RestController
public class TicketController {
	
	@Autowired
	TicketService service;
	
	@RequestMapping(value = "/mypage", method = RequestMethod.GET)
	public List<TicketDto> mypage(String id) {
		System.out.println("TicketController mypage()");
		
		List<TicketDto> list = service.mypage(id);
		return list;
	}
	
}
