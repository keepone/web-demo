package com.dubbo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.api.UserApi;
import com.demo.model.User;

@Controller
@RequestMapping("/user")
public class BorrowController {

	@Resource
	private UserApi userApi;

	@RequestMapping("/InsertUser")
	public ModelAndView toIndex(HttpServletRequest request, Model model) {
		int state = Integer.parseInt(request.getParameter("state"));
		String nickname = request.getParameter("nickname");
		User user = new User();
		user.setState(state);
		user.setNickname(nickname);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("result", userApi.insertUser(user));
		ModelAndView modelAndView = new ModelAndView("index", map);
		return modelAndView;
	}

}