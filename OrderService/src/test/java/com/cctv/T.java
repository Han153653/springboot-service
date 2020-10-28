package com.cctv;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cctv.dao.ApplicationUserDao;
import com.cctv.entity.ApplicationUserEntity;

@RunWith(SpringRunner.class)
@SpringBootTest
public class T {

	@Autowired
    private ApplicationUserDao dao;

    @Test
    public void test() throws Exception {
    	
    	List<ApplicationUserEntity> queryList = dao.queryList();
		for (ApplicationUserEntity a : queryList) {
			System.err.println(a.getUserName());
		}

    }
}
