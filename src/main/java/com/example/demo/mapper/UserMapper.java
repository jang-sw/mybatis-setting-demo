package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.dao.UserDao;

@Mapper
public interface UserMapper {

	public void saveUser(UserDao userDao);
	public List<UserDao> findUser(UserDao userDao);
	public void updateUser(UserDao userDao);
	public void deleteById(long id);
}
