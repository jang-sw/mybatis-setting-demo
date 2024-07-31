package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UserDao;
import com.example.demo.service.UserService;

@RestController
public class Controller {

	@Autowired UserService userService;
	
	@GetMapping("/read/user")
	public List<UserDao> getUser(UserDao userDao){
		return userService.findUser(userDao);	
	}
	@PostMapping("/add/user")
	public int addUser(UserDao userDao){
		return userService.saveUser(userDao);	
	}
	@PostMapping("/remove/user")
	public int removeUser(Long id){
		return userService.deleteById(id);	
	}
	@PostMapping("/update/user")
	public int updateUser(UserDao userDao){
		return userService.updateUser(userDao);	
	}
}
