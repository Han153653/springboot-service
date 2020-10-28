package com.cctv.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString(exclude={"id","name"}) //指定输出属性
public class Person {

	private Integer id;
	private String name;
	private Integer age;

	
}
