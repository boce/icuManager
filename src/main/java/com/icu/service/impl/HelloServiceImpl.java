package com.icu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.icu.dao.HelloDao;
import com.icu.service.HelloService;

@Transactional(propagation=Propagation.REQUIRED)
@Service("helloService")
public class HelloServiceImpl implements HelloService {
	
	@Autowired
	private HelloDao helloDao;

	@Override
	public String getSayHello() {
		
		int num = helloDao.getNum();
		
		System.out.println("HelloService:"+num);
		
		return "Hello" + num;
	}

}
