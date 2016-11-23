package com.zhuangjinxin.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhuangjinxin.demo.mapper.UserMapper;

@Service
public class UserService {
	
	@Autowired
    private UserMapper userMappper;
	
	public String getNameById(int id){
		return userMappper.getNameById(id);
	}

}
