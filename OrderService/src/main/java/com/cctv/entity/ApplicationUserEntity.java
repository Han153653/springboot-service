package com.cctv.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ApplicationUserEntity  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long userId;
	private String userName;
	private String userDir;
	private String mobile;
	private String password;
	private String createTime;
	private String accessKeyid;
	private String accessKeysecre;
	private String status;
	private String authority;
	
}
