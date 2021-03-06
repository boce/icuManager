package com.icu.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icu.service.HelloService;

@Controller
public class HelloController {
	
	private static final Logger log = LoggerFactory.getLogger(HelloController.class);
	
	@Autowired
    private HelloService helloService;

    
    @RequestMapping("helloworld")
    public String getNewName(@RequestParam("userName") String userName,HttpServletRequest request){
    	
       log.info("helloworld");
    	
       System.out.println(userName);

       String newUserName = helloService.getSayHello();  
    		

       request.setAttribute("newUserName", newUserName);

       return "helloworld";

    }

}
