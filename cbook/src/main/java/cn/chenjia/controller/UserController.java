package cn.chenjia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.chenjia.core.bean.User;
import cn.chenjia.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/userlist")
	public String getUserlist() {
		return "userlist";
	}
	
	@RequestMapping("/addUser")
	public String addUser() {
		return "adduser";
	}

	@RequestMapping(value = "/AddUserFunc")
	public String AddUser(User user) {
//		System.out.println(user.getuUsername()+"\n"+user.getuPassword());
		boolean success = userService.AddUser(user);
		if(success) {
			System.out.println("添加用户成功");
		} else {
			System.out.println("添加用户失败");
		}
		return "adduser";
	}
}
