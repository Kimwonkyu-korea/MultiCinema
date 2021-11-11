package com.one.multicinemaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.MypageDto;
import com.one.multicinemaback.dto.UserDto;
import com.one.multicinemaback.service.MypageService;

@RestController
public class MypageControllser {
	
	@Autowired
	MypageService service;
	
	@RequestMapping(value = "/pwCheck", method = RequestMethod.POST)
	public UserDto infoUser(UserDto user) {
		System.out.println("MypageControllser pwCheck()");
		System.out.println(user);
		UserDto data = service.pwCheck(user);
		
		return data;
		
	}
	
	
	// 패스워드 수정
	@RequestMapping(value = "/userUp", method = RequestMethod.POST)
	public String pwUp(UserDto user){
		System.out.println("MypageControllser pwUp()");
		System.out.println(user);
		
		boolean b = service.pwUp(user);
		if(b == true) {
			return "OK";
		}else {
			return "NG";
		}
	}
	
	// 당일내역 리스트
	@RequestMapping(value = "/getTodayList", method = RequestMethod.GET)
	public List<MypageDto> getTodayList(String id) {
		System.out.println("MypageControllser getTodayList()");
		// System.out.println(id);
		
		List<MypageDto> list = service.getTodayList(id);
		return list;
	}
	
	// 지난내역 리스트
	@RequestMapping(value = "/getPastList", method = RequestMethod.GET)
	public List<MypageDto> getPastList(String id) {
		System.out.println("MypageControllser getPastList()");

		List<MypageDto> list = service.getPastList(id);
		return list;
	}
}
