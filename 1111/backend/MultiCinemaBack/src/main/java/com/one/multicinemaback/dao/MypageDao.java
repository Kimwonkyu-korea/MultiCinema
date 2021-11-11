package com.one.multicinemaback.dao;

import java.util.List;  

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.MypageDto;
import com.one.multicinemaback.dto.UserDto;

@Mapper
@Repository
public interface MypageDao {
	UserDto pwCheck(UserDto user);
	boolean pwUp(UserDto user);
	List<MypageDto> getTodayList(String id);
	List<MypageDto> getPastList(String id);
}
