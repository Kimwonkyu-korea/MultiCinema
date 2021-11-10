package com.one.multicinemaback.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.UserDto;

@Mapper
@Repository
public interface UserDao {
	int addUser(UserDto user);
	UserDto getUser(String id);
	boolean upUser(UserDto user);
}
