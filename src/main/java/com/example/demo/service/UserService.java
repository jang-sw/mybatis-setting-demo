package com.example.demo.service;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {

	@Autowired UserMapper userMapper;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	public int saveUser(UserDao userDao) {
		try {
			userMapper.saveUser(userDao);
			return 1;
		}catch (Exception e) {
			logger.error("", e);
			return -1;
		}
	}
	public List<UserDao> findUser(UserDao userDao) {
		try {
			return userMapper.findUser(userDao);
		}catch (Exception e) {
			logger.error("", e);
			return Collections.emptyList();
		}
	}
	public int updateUser(UserDao userDao) {
		try {
			userMapper.updateUser(userDao);
			return 1;
		}catch (Exception e) {
			logger.error("", e);
			return -1;
		}
	}
	public int deleteById(Long id) {
		try {
			userMapper.deleteById(id);
			return 1;
		}catch (Exception e) {
			logger.error("", e);
			return -1;
		}
	}
	
}
