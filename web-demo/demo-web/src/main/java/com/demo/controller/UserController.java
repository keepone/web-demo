package com.demo.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.model.User;
import com.demo.service.UserService;
import com.demo.service.impl.UserServiceImpl;


@Controller
@RequestMapping("/")
public class UserController{

	
	@Resource
	private UserService  userService;
	
	
   @RequestMapping("index")
   public String index(){
       return "index";
   }
   
   @RequestMapping("/showUser")  
   public String toIndex(HttpServletRequest request,Model model){  
       int state = Integer.parseInt(request.getParameter("state"));  
       String nickname   = request.getParameter("nickname"); 
       User user=new User();
       user.setState(state);
       user.setNickname(nickname);
       int count = this.userService.insertUser(user);
       System.out.println(count);
       return "showUser"; 
   }
}