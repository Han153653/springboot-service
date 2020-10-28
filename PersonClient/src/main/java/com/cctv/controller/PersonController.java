package com.cctv.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cctv.entity.ApplicationUserEntity;
import com.cctv.feign.OrderFeign;

@RestController
@RequestMapping("/p")
public class PersonController {
	
	@Autowired
	OrderFeign orderFeign;
	
	@RequestMapping("/list")
	public List<ApplicationUserEntity> list(){
		return orderFeign.list();
	}
	
	@RequestMapping("/index")
	public String index(HttpSession session){
		String index = orderFeign.index();
		session.setAttribute("port", index);
		return orderFeign.index();
	}
	
	@RequestMapping("/exit")
	public String exit(HttpSession session){
		session.invalidate();
		return "OK";
	}

}
