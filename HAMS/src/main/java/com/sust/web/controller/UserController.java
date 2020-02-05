package com.sust.web.controller;

import java.util.Date;
import java.util.List;

/*
 * 对用户的操作
 */
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sust.bean.TBuild;
import com.sust.bean.TLog;
import com.sust.bean.TUser;
import com.sust.service.IBulidServcie;
import com.sust.service.ILogServcie;
import com.sust.service.IUserService;

@Controller
public class UserController {
	@Autowired
	private IUserService userImpl;
	@Autowired
	private ILogServcie logService;
	@Autowired 
	private IBulidServcie buildService;

	// 用户登录，携带session名称为（loginUser）成功之后跳转到主页
	@RequestMapping("/loginSuccess")
	public String login(TUser user, HttpSession session,Model model) {
		TUser loginUser = null;
		try {
			loginUser = userImpl.login(user.getAccount(), user.getPassword());
			List<TBuild> selectAllBuilds = buildService.selectAllBuilds();
			session.setAttribute("loginUser", loginUser);
			session.setAttribute("buildList", selectAllBuilds);
		} catch (Exception e) {
			model.addAttribute("msg", e.getMessage());
			return "login.jsp";
		}
		if ("0".equals(loginUser.getRole())) {
			return "admin/main.jsp";
		}
		return "index.jsp";
	}
	// 用户注册,注册成功跳转到登陆页面
	@RequestMapping(value = "/register", method = RequestMethod.POST) 
	public String register(TUser user,Model model) {
			
		try {
			userImpl.register(user);
		} catch (Exception e) {
			//e.printStackTrace();
			model.addAttribute("msg", e.getMessage());
			return "register.jsp";
		}
		return "login.jsp";
	}
	
	// 通过id改变用户的状态。跟新完成之后跳转到index
	@RequestMapping("/changeUserFlag")
	public String changeUserFlag(String flag, int id) throws Exception {
		userImpl.changeUserFlag(flag, id);
		TLog log = new TLog(id, "改变用户的状态", new Date());
		logService.insertLog(log);
		return "index";
	}

	// 修改用户的信息
	@RequestMapping("/updateUser")
	public String updateUser(TUser user) throws Exception {
		userImpl.updateUser(user);
		TLog log = new TLog(user.getId(), "改变用户的状态", new Date());
		logService.insertLog(log);
		return "index";
	}

}
