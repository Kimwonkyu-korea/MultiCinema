package com.one.multicinemaback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.UserDto;
import com.one.multicinemaback.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public UserDto getUser(String id){
		System.out.println("UserController getUser()");
		UserDto user = service.getUser(id);
		return user;
	}
	
	@RequestMapping(value = "/upUser", method = RequestMethod.GET)
	public String upUser(UserDto user){
		System.out.println("UserController upUser()");
		
		boolean b = service.upUser(user);
		if(b == true) {
			return "OK";
		}else {
			return "NG";
		}
	}
}
