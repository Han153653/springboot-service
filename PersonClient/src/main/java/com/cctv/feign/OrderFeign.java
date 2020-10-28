package com.cctv.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import com.cctv.entity.ApplicationUserEntity;

@FeignClient(value="order")
public interface OrderFeign {

	@GetMapping("/order/list")
	public List<ApplicationUserEntity> list();

	@GetMapping("/order/index")
	public String index();
	
}
