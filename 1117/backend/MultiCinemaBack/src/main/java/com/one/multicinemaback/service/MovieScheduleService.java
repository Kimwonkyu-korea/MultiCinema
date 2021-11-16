package com.one.multicinemaback.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.one.multicinemaback.dao.MovieScheduleDao;
import com.one.multicinemaback.dto.MovieScheduleDto;

@Service
@Transactional
public class MovieScheduleService {
	
	@Autowired
	MovieScheduleDao dao;
	
	public void addMS(MovieScheduleDto ms) {
		dao.addMS(ms);
	}
	
	public List<MovieScheduleDto> getMovieTitle(String sdate) {
		return dao.getMovieTitle(sdate);
	}
}
