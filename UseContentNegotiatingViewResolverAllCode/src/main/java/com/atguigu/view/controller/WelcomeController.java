package com.atguigu.view.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.atguigu.view.pojo.User;

@Controller
@RequestMapping("/demo")
public class WelcomeController {

	private static Map<Integer,User> map = new HashMap<>(); 
	
	static{
		for(int i=1;i<7;i++){
			map.put(i, new User("jetty-"+i,20+i,"Beijing-"+i));
		}
	}
	// 无需借助@ResponseBody 基于后缀返回指定格式数据 
	/*
	 *  /demo/1/user.pdf  /demo/1/user.xls  /demo/1/user.json  
	 *  /demo/1/user.xml  /demo/1/user.html /demo/1/user
	 *   
	 * */
	@RequestMapping(value={"/{id}/user"})
	public String getJson(@PathVariable("id")Integer id,Model model){
		model.addAttribute(map.get(id));
		return "common";
	}
}
