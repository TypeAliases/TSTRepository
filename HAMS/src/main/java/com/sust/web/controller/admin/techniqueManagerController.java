package com.sust.web.controller.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sust.bean.BuildMake;
import com.sust.bean.BuildTechnique;
import com.sust.bean.TBuild;
import com.sust.bean.TMake;
import com.sust.bean.TTechnique;
import com.sust.service.IBuildTechniqueService;
import com.sust.service.IBulidServcie;
import com.sust.service.ITechniqueService;

@Controller
public class techniqueManagerController {
	@Autowired
	private IBulidServcie bulidServcie;
	@Autowired
	private IBuildTechniqueService bTechniqueService;
	@Autowired
	private ITechniqueService techniqueService;

	@RequestMapping("toTechniqueManager/{buildId}/{curPage}")
	public String toTechniqueManager(Model model, @PathVariable int curPage, @PathVariable int buildId)
			throws Exception {
		PageInfo<BuildTechnique> pageInfo = bTechniqueService.selectAllByBuildIdPage(curPage, buildId);
		TBuild build = null;
		if (pageInfo == null) {
			build = bulidServcie.selectBuildById(buildId);
			model.addAttribute("build", build);
			return "/admin/techniqueManager.jsp";
		}
		for (BuildTechnique bTechnique : pageInfo.getList()) {
			build = bulidServcie.selectBuildById(buildId);
			TTechnique technique = techniqueService.selecTechniqueById(bTechnique.getTechniques().getId());
			bTechnique.setTechniques(technique);
			bTechnique.setBuild(build);
		}
		model.addAttribute("build", build);
		model.addAttribute("pageInfo", pageInfo);
		return "/admin/techniqueManager.jsp";
	}

	// 跳转添加工艺信息记录
	@RequestMapping("/toAddTechnique/{buildId}")
	public String addTechniqueManager(Model model, @PathVariable int buildId) throws Exception {
		model.addAttribute("buildId", buildId);
		return "/admin/addTechnique.jsp";

	}

	// 成功添加工艺记录
	@RequestMapping("/addTechniqueSuccess")
	public @ResponseBody void addTechniqueSuccess(TTechnique tTechnique, Integer buildId) throws Exception {
		techniqueService.insertTechnique(tTechnique);
		BuildTechnique bTechnique = new BuildTechnique();
		TTechnique technique = techniqueService.selectLast();
		bTechnique.setBuildId(buildId);
		bTechnique.setTechnique(technique.getId());
		bTechniqueService.insertBuildTechnique(bTechnique);
	}

	// 跳转到工艺详情
	@RequestMapping("/toShowTechnique/{id}")
	public String selectTechniqueManager(Model model, @PathVariable int id) throws Exception {
		List<BuildTechnique> buildTechniqueList = bTechniqueService.selectBuildTechniqueByTechniqueId(id);
		for (BuildTechnique buildTechnique : buildTechniqueList) {
			Integer technique = buildTechnique.getTechnique();
			TTechnique selecTechniqueById = techniqueService.selecTechniqueById(id);
			buildTechnique.setTechniques(selecTechniqueById);
			model.addAttribute("techniques", buildTechnique);
		}
		return "/admin/showTechnique.jsp";
	}

	// 跳转到修改工艺信息
	@RequestMapping("/toUpdateTechnique/{id}")
	public String updateMakeManager(Model model, @PathVariable int id) throws Exception {
		List<BuildTechnique> buildTechniqueList = bTechniqueService.selectBuildTechniqueByTechniqueId(id);
		for (BuildTechnique buildTechnique : buildTechniqueList) {
			Integer technique = buildTechnique.getTechnique();
			TTechnique selecTechniqueById = techniqueService.selecTechniqueById(id);
			buildTechnique.setTechniques(selecTechniqueById);
			model.addAttribute("techniques", buildTechnique);
		}
		return "/admin/updateTechnique.jsp";
	}

	// 提交修改
	@RequestMapping("/updateTechniqueSuccess")
	public @ResponseBody void updateTechniqueSuccess(TTechnique tTechnique) throws Exception {
		techniqueService.updateTechnique(tTechnique);

	}

	// 删除建筑-工艺信息表的内容和对应的工艺记录
	@RequestMapping("/toDeleteTechnique/{id}")
	public @ResponseBody void deleteTechniqueManager(@PathVariable int id) throws Exception {
		
		bTechniqueService.deleteBuildTechniqueById(id);
		techniqueService.deleteTechnique(id);
	}

}
