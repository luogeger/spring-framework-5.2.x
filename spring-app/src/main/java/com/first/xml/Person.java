package com.first.xml;

import lombok.Data;

import java.util.logging.Logger;


public class Person {

	private static final Logger logger = Logger.getGlobal();

	private String  name;

	private String  password;

	private Integer age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void hello () {
		logger.info("Hello Person ...");
	}

	@Override
	public String toString() {
		return "Person{" +
				"name='" + name + '\'' +
				", password='" + password + '\'' +
				", age=" + age +
				'}';
	}
}
