package com.one.multicinemaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.one.multicinemaback.dto.MovieScheduleDto;
import com.one.multicinemaback.service.MovieScheduleService;

@Repository
public class MovieScheduleController {
	
	@Autowired
	MovieScheduleService mservice;
	
	@RequestMapping(value = "/mtitle", method = RequestMethod.POST)
	public List<MovieScheduleDto> mtitle(String sdate) {
		System.out.println("MovieScheduleController mtitle()");
		
		List<MovieScheduleDto> list = mservice.getMovieTitle(sdate);
		
		return list;

	}
}
