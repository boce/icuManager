package com.icu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.icu.service.IhelloService;

@Controller
public class HelloController {
	
	@Autowired
    private IhelloService helloService;

    
    @RequestMapping("helloworld")
    public String getNewName(@RequestParam("userName") String userName,HttpServletRequest request){
    	
       System.out.println(userName);

       String newUserName = helloService.getSayHello();  
    		

       request.setAttribute("newUserName", newUserName);

       return "helloworld";

    }

}
