package com.zhuangjinxin.demo.mapper;

import org.apache.ibatis.annotations.Select;

import com.zhuangjinxin.demo.domain.User;

public interface UserMapper {

	@Select("select * from user where id = #{id}")
	public User getById(int id);
	
	@Select("select username from user where id = #{id}")
    public String getNameById(long id);
}
