package com.sust.web.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageInfo;
import com.sust.bean.TLog;
import com.sust.bean.TUser;
import com.sust.service.ILogServcie;
import com.sust.service.IUserService;

@Controller
public class LogManagerController {
	@Autowired
	private ILogServcie ILogServcie;
	@Autowired
	private IUserService userService;
	
	// 显示所有的日志，前台获取当前页curpage
	@RequestMapping("toLogManager/{curPage}")
	public String toLogManager(Model model,@PathVariable int curPage) throws Exception {
		PageInfo<TLog> pageInfo = ILogServcie.selectAllLogsPage(curPage, 15);
		for (TLog tLog : pageInfo.getList()) {
			TUser user = userService.selectTUserById(tLog.getUserId());
			tLog.setUser(user);
		}
		model.addAttribute("pageInfo",pageInfo);
		return "/admin/logManager.jsp";
	}

	// 修改日志信息
	@RequestMapping("/updateLogManager/{id}")
	public String updateLogManager(Model model, TUser user, @PathVariable int id) throws Exception {

		return "admin/logManager.jsp";
	}

	// 查看日志的详细信息 
	@RequestMapping("/selectLogManager/{id}")
	public String selectLogManager(Model model, @PathVariable int id) throws Exception {
		return "admin/logManager.jsp";
	}

	// 刪除日志信息
	@RequestMapping("/deleteLogManager/{id}")
	public String deleteLogManager( @PathVariable int id) throws Exception {
		return "admin/logManager.jsp";
	}
}
