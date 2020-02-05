package com.sust.web.controller.admin;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sust.bean.TBulletin;
import com.sust.bean.TLog;
import com.sust.bean.TUser;
import com.sust.service.IBulletinServcie;
import com.sust.service.ILogServcie;
import com.sust.service.IUserService;

/*
 * 公告管理
 */
@Controller
public class NoticeManagerController {
	@Autowired
	private IBulletinServcie IBulletinServcie;
	@Autowired
	private IUserService userService;
	@Autowired
	private ILogServcie logService;
	// 跳转到公告，携带公告的信息
	@RequestMapping("/toNoticeManager/{curPage}")
	public String toNoticeManager(Model model,@PathVariable int curPage) throws Exception {
		PageInfo<TBulletin> list = IBulletinServcie.selectAllBulletinPage(curPage, 10);
		for (TBulletin tBulletin : list.getList()) {
			TUser user = userService.selectTUserById(tBulletin.getUserId());
			tBulletin.setUser(user);
		}
		model.addAttribute("pageInfo", list);
		return "/admin/noticeManager.jsp";
	}

	// 跳转到添加公告信息
	@RequestMapping("/toAddNotice")
	public String addNoticeManager(Model model) throws Exception {
		List<TUser> Userlist = userService.selectAllUser();
		model.addAttribute("UserList", Userlist);
		return "/admin/addNotice.jsp";
	}
	//提交添加公告
	@RequestMapping("addNoticeSuccess")
	public @ResponseBody void NoticeAddSuccess(TBulletin tBulletin) throws Exception {
		IBulletinServcie.insertBulletin(tBulletin);
		TLog log = new TLog(2, "添加公告："+tBulletin.getTitle(), new Date());
		logService.insertLog(log);
	}
	// 跳转到修改公告信息
	@RequestMapping("/toUpdateNotice/{id}")
	public String updateNoticeManager(Model model,@PathVariable int id) throws Exception {
		TBulletin tBulletin = IBulletinServcie.selecTBulletinbyId(id);
		TUser user = userService.selectTUserById(tBulletin.getUserId());
		tBulletin.setUser(user);
		model.addAttribute("updateBulletion", tBulletin);
		return "/admin/updateNotice.jsp";
	}
	//提交修改公告信息
	@RequestMapping("/updateNoticeSuccess")
	public @ResponseBody void NoticeUpdateSuccess(TBulletin tBulletin) throws Exception {
		IBulletinServcie.updateBulletin(tBulletin);
		TLog log = new TLog(2, "修改公告："+tBulletin.getTitle(), new Date());
		logService.insertLog(log);
	}

	// 查看公告信息
	@RequestMapping("/toShowNotice/{id}")
	public String selectNoticeManager(Model model, @PathVariable int id) throws Exception {
		TBulletin tBulletin = IBulletinServcie.selecTBulletinbyId(id);
		TUser user = userService.selectTUserById(tBulletin.getUserId());
		tBulletin.setUser(user);
		model.addAttribute("showBulletion", tBulletin);
		return "/admin/showNotice.jsp";
	}

	// 删除公告信息
	@RequestMapping("/toDeleteNotice/{id}")
	public @ResponseBody void deleteNoticeManagerr(@PathVariable Integer id) throws Exception {
		TBulletin tBulletin = IBulletinServcie.selecTBulletinbyId(id);
		IBulletinServcie.deleteBulletin(id);
		TLog log = new TLog(2, "删除公告："+tBulletin.getTitle(), new Date());
		logService.insertLog(log);
	}
}
