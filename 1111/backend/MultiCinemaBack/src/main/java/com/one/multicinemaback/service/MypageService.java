package com.one.multicinemaback.service;

import java.util.List; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.MypageDao;
import com.one.multicinemaback.dto.MypageDto;
import com.one.multicinemaback.dto.UserDto;

@Service
@Transactional
public class MypageService {
	
	@Autowired
	MypageDao dao;
	
	public boolean pwUp(UserDto user) {
		return dao.pwUp(user);
	}
	
	public UserDto pwCheck(UserDto user) {
		return dao.pwCheck(user);
	}
	
	public List<MypageDto> getTodayList(String id){
		return dao.getTodayList(id);
	}
	
	public List<MypageDto> getPastList(String id){
		return dao.getPastList(id);
	}
}
