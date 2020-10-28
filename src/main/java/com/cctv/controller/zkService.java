package com.cctv.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cctv.entity.Person;
import com.cctv.utils.QRCodeUtil;


@RestController
@RequestMapping(value="/boot")
public class zkService {
	
	@Value("${boot.addr}")
	private String address;
	@Value("hello")
	private String zk1;
	
	@RequestMapping(value="/say",method=RequestMethod.GET)
	private String hello(){
		return address;
	}
	
	@GetMapping(value="/say1")
	private String hello1(){
		return zk1;
	}
	
	@GetMapping(value="/getPerson")
	private void getPerson(){
		Person p = new Person();
		p.setAge(19);
		p.setName("张三");
		System.out.println(p.toString());
		
	}
	
	/*@RequestMapping("identityCode.jpg")
	public void captcha(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException {
        response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");
        String t = request.getParameter("t");
        //生成文字验证码
        String text = producer.createText();
        //生成图片验证码
        BufferedImage image = producer.createImage(text);
        //保存到redis中
        redisDao.setStringWithExpired(t, text,30*60*1000);
        ServletOutputStream out = response.getOutputStream();
        ImageIO.write(image, "jpg", out);
	}*/
	
	
	@GetMapping(value="/getImg")
	public void getImg(HttpServletRequest request,HttpServletResponse response) throws Exception{
		response.setHeader("Cache-Control", "no-store, no-cache");
        response.setContentType("image/jpeg");
		// 存放在二维码中的内容
        // 二维码中的内容可以是文字，可以是链接等 http://www.baidu.com
         String text = "Hello World ！！！";
        // 嵌入二维码的图片路径
        // String imgPath = "C:\\Users\\Public\\Pictures\\img\\code1.jpg";
        // 生成的二维码的路径及名称
        // String destPath = "C:\\Users\\Public\\Pictures\\img\\code" + System.currentTimeMillis() + ".jpg";
        // 生成二维码
        // QRCodeUtil.encode(text, null, destPath, true);
        // 解析二维码
        // String str = QRCodeUtil.decode(destPath);
         
         // 页面生成二维码 
//          BufferedImage image = QRCodeUtil.encode(text, null, true);
//         ServletOutputStream out = response.getOutputStream();
//         ImageIO.write(image, "jpg", out);
         
         QRCodeUtil.encode(text, response.getOutputStream());
	}

	
}
