package com.cctv.dao;

import java.util.List;
import org.apache.ibatis.annotations.Select;
import com.cctv.entity.ApplicationUserEntity;

public interface ApplicationUserDao {

	
	 ApplicationUserEntity queryObject(Long userId);
	
//	@Select("select * from tab_application_user")
	 List<ApplicationUserEntity> queryList();
}
