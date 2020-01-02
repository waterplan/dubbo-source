package com.spring.demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements IUserDao {
	@Override
	public Object queryForObject(String name) {

		System.out.println("查询数据库");
		return null;
	}
}
