package com.briup.web;

import java.util.Date;

import com.briup.bean.User;
import com.briup.service.UserService;

public class RegistAction {

	private String username;
	private boolean gender;
	private int age;
	private Date birthday;
	private UserService service;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserService getService() {
		return service;
	}

	public void setService(UserService service) {
		this.service = service;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String execute() {
		User user = new User();
		user.setUserName(username);
		user.setAge(age);
		user.setBirthDate(birthday);
		user.setGender(gender);
		try {
			System.out.println(user);
			System.out.println(service);
			service.register(user);
			return "success";
		} catch (Exception e) {
			e.printStackTrace();
			return "error";
		}
	}
}
