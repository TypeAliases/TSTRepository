package com.sust.web.controller.admin;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageInfo;
import com.sust.bean.BuildImage;
import com.sust.bean.BuildMaintenance;
import com.sust.bean.BuildMake;
import com.sust.bean.MakeImage;
import com.sust.bean.TBuild;
import com.sust.bean.TLog;
import com.sust.bean.TMaintenance;
import com.sust.bean.TMake;
import com.sust.bean.TUser;
import com.sust.service.IBuildMakeService;
import com.sust.service.IBulidServcie;
import com.sust.service.ILogServcie;
import com.sust.service.IMakeImageService;
import com.sust.service.IMakeService;

@Controller
public class makeManagerController {
	@Autowired
	private IMakeService makeService;
	@Autowired
	private IBulidServcie bulidServcie;
	@Autowired
	private IBuildMakeService buildMakeService;
	@Autowired IMakeImageService makeImageService;
	// 跳转到构造信息
	@RequestMapping("/toMakeManager/{buildId}/{curPage}")
	public String tobuildManager(Model model,@PathVariable int buildId,@PathVariable int curPage) throws Exception {
		PageInfo<BuildMake> pageInfo = buildMakeService.selectByBuildId(curPage, buildId);
		TBuild build = null ;
		if (pageInfo==null) {
			build= bulidServcie.selectBuildById(buildId);
			model.addAttribute("build", build);
			return "/admin/makeManager.jsp";
		}
		for (BuildMake bMake : pageInfo.getList()) {
			build = bulidServcie.selectBuildById(buildId);
			Integer makeid = bMake.getMake().getId();
			TMake make = makeService.selectMakeById(makeid);
			bMake.setBuild(build);
			bMake.setMake(make);
		}
		model.addAttribute("build", build);
		model.addAttribute("pageInfo", pageInfo);
		return "/admin/makeManager.jsp";
	}
	// 跳转添加构造信息记录
		@RequestMapping("/toAddMake/{buildId}")
		public String addMakeManager(Model model,@PathVariable int buildId) throws Exception {
			model.addAttribute("buildId", buildId);
			return "/admin/addMake.jsp";
		}

		// 成功添加构造记录
		@RequestMapping("/addMakeSuccess")
		public @ResponseBody void addMakeSuccess(TMake tMake,Integer buildId) throws Exception {
			makeService.insertMake(tMake);
			BuildMake buildMake = new BuildMake();
			TMake make = makeService.selectLast();
			buildMake.setBuildId(buildId);
			buildMake.setMakeId(make.getId());
			buildMakeService.insertBuildMake(buildMake);
		}
	
	// 通过构造的id跳转到构造详情
	@RequestMapping("/toShowMake/{id}")
	public String selectMakeManager(Model model, @PathVariable int id) throws Exception {
		TMake make = makeService.selectMakeById(id);
		List<BuildMake> withBuild = buildMakeService.selectByMakeIdWithBuild(id);
		for (BuildMake buildMake : withBuild) {
			
			model.addAttribute("toShowMakeBuild", buildMake);
		}
		model.addAttribute("tMake", make);
		return "/admin/showMake.jsp";
	}
	// 跳转到修改构造信息
	@RequestMapping("/toUpdateMake/{id}")
	public String updateMakeManager(Model model, @PathVariable int id) throws Exception {
		
		TMake upadtamake = makeService.selectMakeById(id);
		List<BuildMake> withBuild = buildMakeService.selectByMakeIdWithBuild(id);
		for (BuildMake buildMake : withBuild) {
			
			model.addAttribute("toUpdateMakeBuild", buildMake);
		}
		model.addAttribute("upadtamake", upadtamake);
		return "/admin/updateMake.jsp";
	}
	// 提交修改
	@RequestMapping("/updateMakeSuccess")
	public @ResponseBody void updateMakeSuccess(TMake make) throws Exception {
		makeService.updateMakeById(make);
	}
	
	// 删除建筑-构造信息表的内容和对应的构造记录
		@RequestMapping("/toDeleteMake/{id}")
		public @ResponseBody void deleteMakeManager(@PathVariable int id) throws Exception {
			makeService.deleteMakeById(id);
			buildMakeService.deleteBuildMakeByMakeId(id);
		}
		//构造图片上传
		@RequestMapping("/uploadMakeImage/{id}")
		@ResponseBody
		public void uploadImage(@PathVariable int id,@RequestParam("file") MultipartFile image,HttpServletRequest request) {
			//动态获取上传文件夹的路径
//			String flag = System.currentTimeMillis()+"";
			String filename = image.getOriginalFilename();//获取上传时的文件名称
//			filename = flag +"."+FilenameUtils.getExtension(filename);//创建一个新的文件名称    getExtension(name):获取文件后缀名
			//imageService.saveBuildImage(new BuildImage(null,filename,id));
			makeImageService.saveMakeImage(new MakeImage(filename,id));
			System.out.println("filename，，，，"+filename);
			//File f= new File("/Users/adam/WorkSpace/HAMS/src/main/webapp/admin/tupian/jinbenxinxi", filename);
			File f= new File("D:\\briup\\Tomcat\\apache-tomcat-8.5.31\\webapps\\HAMS\\admin\\tupian\\makeImage", filename);
			try {
				image.transferTo(f);
				System.out.println("ok");
			} catch (IllegalStateException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//将上传的文件存储到指定位置
		}
		


}
