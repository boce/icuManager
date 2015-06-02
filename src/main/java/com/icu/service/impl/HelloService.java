package com.icu.service.impl;

import org.springframework.stereotype.Service;

import com.icu.service.IhelloService;

@Service("helloService")
public class HelloService implements IhelloService {

	@Override
	public String getSayHello() {
		
		System.out.println("HelloService");
		
		return "Hello";
	}

}
