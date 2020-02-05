package com.sust.web.controller.admin;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.sust.bean.BuildImage;
import com.sust.bean.TBuild;
import com.sust.bean.TLog;
import com.sust.bean.TUser;
import com.sust.service.IBulidServcie;
import com.sust.service.ILogServcie;
import com.sust.service.IUserService;
import com.sust.service.impl.ImageServiceImpl;
/*
 * 建筑管理
 */
@Controller
public class buildManagerController{
	@Autowired
	private IBulidServcie IBulidServcie;
	@Autowired
	private IUserService userService;
	@Autowired 
	private ImageServiceImpl imageService;
	
	// 跳转到建筑管理，携带建筑的信息
	@RequestMapping("/toBuildManager/{curPage}")
	public String tobuildManager(Model model,@PathVariable int curPage) throws Exception {
		PageInfo<TBuild> list = IBulidServcie.selectAllBuildPage(curPage, 10);
		for (TBuild tBuild : list.getList()) {
			TUser user = userService.selectTUserById(tBuild.getUserId());
			tBuild.setUser(user);
			tBuild.setUserId(user.getId());

		}
		model.addAttribute("pageInfo", list);
		return "/admin/buildManager.jsp";
	}
	// 跳转到新增建筑信息
	@RequestMapping("/toAddBuild")
	public String addBuildManager(Model model) throws Exception {
		List<TUser> Userlist = userService.selectAllUser();
		model.addAttribute("UserList", Userlist);
		return "/admin/addBuild.jsp";
	}
	// 提交添加建筑信息
	@ResponseBody
	@RequestMapping(value="/addBuildSuccess",method = RequestMethod.POST)
	public  void addBuildSuccess(TBuild build,HttpServletRequest request) throws Exception {
		TUser user = (TUser) request.getSession().getAttribute("loginUser");
		build.setUser(user);
		build.setPageviews(0);
		build.setUserId(user.getId());
		IBulidServcie.insertBuild(build);
		List<TBuild> selectAllBuilds = IBulidServcie.selectAllBuilds();
		request.getSession().setAttribute("buildList", selectAllBuilds);
	}

	// 跳转到修改建筑信息
	@RequestMapping("/toUpdateBuild/{id}")
	public String updateBuildManager(Model model, @PathVariable int id) throws Exception {
		TBuild build = IBulidServcie.selectBuildById(id);
		model.addAttribute("build", build);
		return "/admin/updateBuild.jsp";
	}
	// 提交修改
	@RequestMapping("/updateBuildSuccess")
	public @ResponseBody void updateBuildSuccess(TBuild build) throws Exception {
		System.out.println(build);
		IBulidServcie.updateBuildById(build);
	}

	// 跳转到建筑详情
	@RequestMapping("/toShowBuild/{id}")
	public String selectBuildManager(Model model, @PathVariable int id) throws Exception {
		TBuild build = IBulidServcie.selectBuildById(id);
		List<BuildImage> list = imageService.findAllBuildById(id);
		model.addAttribute("build", build);
		model.addAttribute("buildImageList", list);
		return "/admin/bulidMsg.jsp";
	}

	// 删除建筑详情
	@RequestMapping("/toDeleteBuild/{id}")
	public @ResponseBody void deleteBuildManager(@PathVariable int id) throws Exception {
		TBuild build = IBulidServcie.selectBuildById(id);
		IBulidServcie.deleteBuildById(id);
	}
	//建筑图片上传
	@RequestMapping("/uploadImage/{id}")
	@ResponseBody
	public void uploadImage(@PathVariable int id,@RequestParam("file") MultipartFile image,HttpServletRequest request) {
		//动态获取上传文件夹的路径
//		System.out.println("11111"+id);
		String flag = System.currentTimeMillis()+"";
		String filename = image.getOriginalFilename();//获取上传时的文件名称
//		System.out.println("2222"+filename);
//		filename = flag +"."+FilenameUtils.getExtension(filename);//创建一个新的文件名称    getExtension(name):获取文件后缀名
//		System.out.println("333"+filename);
		imageService.saveBuildImage(new BuildImage(filename,id));
		//File f= new File("/Users/adam/WorkSpace/HAMS/src/main/webapp/admin/tupian/jinbenxinxi", filename);
		File f= new File("D:\\apache-tomcat-9.0.27\\webapps\\HAMS\\admin\\tupian\\jinbenxinxi", filename);
		try {
			image.transferTo(f);
			System.out.println("ok");
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//将上传的文件存储到指定位置
	}

}
