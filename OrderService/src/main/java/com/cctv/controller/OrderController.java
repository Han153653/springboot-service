package com.cctv.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cctv.dao.ApplicationUserDao;
import com.cctv.entity.ApplicationUserEntity;

@RestController
@RequestMapping("/order")
public class OrderController {

	@org.springframework.beans.factory.annotation.Value("${server.port}")
	private Integer port;
	
	@Autowired
	ApplicationUserDao applicationUserDao;
	
	@GetMapping("/index")
	public String getPort(){
		return "order服务端口为："+this.port;
	}
	 
	@RequestMapping("/list")
	public List<ApplicationUserEntity> list(){
		return applicationUserDao.queryList();
	}
	
//	@RequestMapping("/info/{userId}")
//	public ApplicationUserEntity info(@PathVariable("userId") Long userId){
//		return applicationUserDao.queryObject(userId);
//	}
}
