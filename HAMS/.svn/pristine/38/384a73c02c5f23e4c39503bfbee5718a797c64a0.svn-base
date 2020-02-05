package com.sust.web.controller.admin;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.sust.bean.TLog;
import com.sust.bean.TUser;
import com.sust.service.ILogServcie;
import com.sust.service.IUserService;

/*
 * 用户管理
 */
@Controller
public class UserManagerController {
	@Autowired
	private IUserService userImpl;
	@Autowired
	private ILogServcie logService;
	// 跳转到用户管理页面
	@RequestMapping("/toUserManager/{curPage}")
	public String toUserManager(Model modle,@PathVariable int curPage) throws Exception {
		PageInfo<TUser> pageInfo = userImpl.selectAllUserPage(curPage, 10);
		modle.addAttribute("pageInfo", pageInfo);
		return "/admin/userManager.jsp";
	}

	// 跳转到修改用户页面
	@RequestMapping("/toUpdateUser/{id}")
	public String UpdateUserManager(Model model, @PathVariable int id) throws Exception {
		TUser selectTUserById = userImpl.selectTUserById(id);
		model.addAttribute("selectTUserById", selectTUserById);
		return "/admin/updateUser.jsp";
	}
	//提交修改
	@RequestMapping("updateSuccess")
	public @ResponseBody void updateSuccess(TUser user) throws Exception {
		System.out.println(user+"-------"+user.getFile());
		userImpl.updateUser(user);
		TLog log = new TLog(2, "修改用户信息:"+user.getName(), new Date());
		logService.insertLog(log);
	}
	//
	@RequestMapping("addImg")
	public @ResponseBody void Success(MultipartFile file) throws Exception {
		System.out.println(file.getOriginalFilename());
	}

	// 跳转到查看详情
	@RequestMapping(value = "/toShowUser/{id}", method = RequestMethod.GET)
	public String SelectUserManager(Model model, @PathVariable("id") int id) throws Exception {
		TUser selectTUserById = userImpl.selectTUserById(id);
		model.addAttribute("selectTUserById", selectTUserById);
		return "/admin/showUser.jsp";
	}

	// 跳转到添加用户
	@RequestMapping(value = "/toAddUser")
	public String toAddUser() {
		return "/admin/addUser.jsp";
	}
	
	//提交添加用户
	@RequestMapping("addSuccess")
	public @ResponseBody void addSuccess(TUser user) throws Exception {
		userImpl.register(user);
		TLog log = new TLog(2, "添加用户信息："+user.getName(), new Date());
		logService.insertLog(log);
	}
}
