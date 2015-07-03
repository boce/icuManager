package com.icu.dao.impl;


import org.springframework.stereotype.Repository;

import com.icu.dao.HelloDao;

@Repository("helloDao")
public class HelloDaoImpl extends BaseDao implements HelloDao {

	@Override
	public int getNum() {
		
		String sql = "select count(1) num from m_user";
		
		int num = this.getJdbcTemplate().queryForObject(sql, Integer.class);
		
		return num;
	}
	
	

}
