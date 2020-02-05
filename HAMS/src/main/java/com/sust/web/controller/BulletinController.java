package com.sust.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sust.bean.TBulletin;
import com.sust.service.IBulletinServcie;

/*
 * 操作公告
 */
@Controller
public class BulletinController {
	@Autowired
	private IBulletinServcie bulletinServce;

	// 添加公告
	@RequestMapping("/insertBulletin")
	public String insertBulletin(TBulletin tBulletin) throws Exception {
		bulletinServce.insertBulletin(tBulletin);
		return null;
	}

	// 删除公告通过id
	@RequestMapping("/deleteBulletinById")
	public String deleteBulletin(int id) throws Exception {
		bulletinServce.deleteBulletin(id);
		return null;
	}

	// 更新公告
	@RequestMapping("/updateBulletin")
	public String updateBulletin(TBulletin tBulletin) throws Exception {
		bulletinServce.updateBulletin(tBulletin);
		return null;
	}

	// 查询所有的公告
	@RequestMapping("/newBulletinShow")
	public String selectAllBulletins(/*@RequestParam(name="pageNum",defaultValue="1")*/int curPage,Model model) {
		System.out.println(curPage);
		//List<TBulletin> allBulletins = null;
		PageInfo<TBulletin> allBulletins;
		try {
			//allBulletins = bulletinServce.selectAllBulletins();
			allBulletins=bulletinServce.selectAllBulletinPage(curPage, 5);
			model.addAttribute("allBulletins", allBulletins);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "newsList.jsp";
	}
	@RequestMapping("/findBulletinByName")
	public String findBulletinByName(String bulletinName,Model model) {
		System.out.println(bulletinName);
		try {
			List<TBulletin> selectTBulletinByName = bulletinServce.selectTBulletinByName(bulletinName);
			model.addAttribute("allBulletins", selectTBulletinByName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "newsList.jsp";
	}
	@RequestMapping("/findBulletinById")
	public String findBulletinById(int bulletinId,Model model) {
		System.out.println(bulletinId);
		try {
			TBulletin selectTBulletinbyId = bulletinServce.selecTBulletinbyId(bulletinId);
			model.addAttribute("TBulletin", selectTBulletinbyId);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "newsMsg.jsp";
	}
	@RequestMapping("/newShowPage")
	public String newShowPage(@RequestParam(name="pageNum",defaultValue="1")int curPage,Model model) {
		System.out.println(curPage);
		PageInfo<TBulletin> selectAllBulletinPage = bulletinServce.selectAllBulletinPage(curPage, 5);
		System.out.println(selectAllBulletinPage);
		model.addAttribute("allBulletinsPage", selectAllBulletinPage);
		return "newsList.jsp";
	}
	
}
