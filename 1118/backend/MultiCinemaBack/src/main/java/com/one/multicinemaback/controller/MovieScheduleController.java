package com.one.multicinemaback.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.one.multicinemaback.dto.MovieScheduleDto;
import com.one.multicinemaback.service.MovieScheduleService;

@RestController
public class MovieScheduleController {
	
	@Autowired
	MovieScheduleService mservice;
	
	// 영화 제목
	@RequestMapping(value = "/mtitle", method = RequestMethod.POST)
	public List<MovieScheduleDto> mtitle(String sdate) {
		System.out.println("MovieScheduleController mtitle()");
		System.out.println(sdate);
		
		List<MovieScheduleDto> list = mservice.mtitle(sdate);
		System.out.println(list);
		
		return list;
	}
	
	// 상영 시간
	@RequestMapping(value = "/mtime", method = RequestMethod.POST)
	public List<MovieScheduleDto> mtime(String title) {
		System.out.println("MovieScheduleController mtime()");
		System.out.println(title);
		
		List<MovieScheduleDto> list = mservice.mtime(title);
		System.out.println(list);
		
		return list;
	}
	
}
