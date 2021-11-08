package com.one.multicinemaback.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.one.multicinemaback.dto.TicketDto;
import com.one.multicinemaback.dto.UserDto;

@Mapper
@Repository
public interface TicketDao {
	List<TicketDto> mypage(String id);
	boolean upUser(UserDto user);
	UserDto infoUser(String id);
}
