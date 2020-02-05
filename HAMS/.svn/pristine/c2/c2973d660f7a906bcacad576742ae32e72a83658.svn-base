package com.sust.web.controller.admin;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageInfo;
import com.sust.bean.BuildMaintenance;
import com.sust.bean.TBuild;
import com.sust.bean.TLog;
import com.sust.bean.TMaintenance;
import com.sust.bean.TUser;
import com.sust.service.IBuildMaintenanceService;
import com.sust.service.IBulidServcie;
import com.sust.service.ILogServcie;
import com.sust.service.IMaintenanceService;

/*
 * 维修管理
 */
@Controller
public class RepairManagerController {
	@Autowired
	private IMaintenanceService IMaintenanceService;
	@Autowired
	private IBuildMaintenanceService buildIMaintenanceService;
	@Autowired
	private IBulidServcie buildService;
	@Autowired
	private ILogServcie logService;

	// 跳转到维修管理，携带维修管理的信息

	@RequestMapping("/toRepairManager/{curPage}")
	public String toUserManager(Model model,@PathVariable int curPage) throws Exception {
		PageInfo<BuildMaintenance> list = buildIMaintenanceService.selectAllBuildMaintenancePage(curPage, 10);
		if (list.getList().size()!=0) {
			for (BuildMaintenance buildMaintenance : list.getList()) {
				
				Integer maintenanceId = buildMaintenance.getMaintenanceId();
				Integer buildId = buildMaintenance.getBuildId();
				TMaintenance maintenance = IMaintenanceService.selecTMaintenance(maintenanceId);
				TBuild build = buildService.selectBuildById(buildId);
				buildMaintenance.setBuild(build);
				buildMaintenance.setMaintenance(maintenance);
			}

		}
		
		model.addAttribute("pageInfo", list);
		return "/admin/repairManager.jsp";
	}

	// 跳转添加维修记录
	@RequestMapping("/toAddRepair")
	public String addRepairManager(Model model) throws Exception {
		List<TBuild> list = buildService.selectAllBuilds();
		model.addAttribute("builds", list);
		return "/admin/addRepair.jsp";
	}

	// 成功添加维修记录
	@RequestMapping("/addRepairSuccess")
	public @ResponseBody void addRepairSuccess(TMaintenance maintenance,Integer buildid) throws Exception {
		IMaintenanceService.insertMaintenance(maintenance);
		TMaintenance tMaintenance = IMaintenanceService.selectLast();
		BuildMaintenance buildMaintenance = new BuildMaintenance();
		buildMaintenance.setBuildId(buildid);
		buildMaintenance.setMaintenanceId(tMaintenance.getId());
		buildIMaintenanceService.insertBuildMaintenance(buildMaintenance);
	}

	// 跳转修改维修管理的信息
	@RequestMapping("/toUpdateRepair/{id}")
	public String updateRepairManager(Model model,@PathVariable int id) throws Exception {
		BuildMaintenance buildMaintenance = buildIMaintenanceService.selectBuildMaintenanceById(id);
		Integer buildId = buildMaintenance.getBuildId();
		Integer maintenanceId = buildMaintenance.getMaintenanceId();
		TBuild build = buildService.selectBuildById(buildId);
		TMaintenance maintenance = IMaintenanceService.selecTMaintenance(maintenanceId);
		buildMaintenance.setBuild(build);
		buildMaintenance.setMaintenance(maintenance);
		model.addAttribute("buildMaintenance", buildMaintenance);
		return "/admin/updateRepair.jsp";
	}

	// 提交修改维修管理的信息
	@RequestMapping("/updateRepairSuccess")
	public @ResponseBody void successUpdateRepairManager(TMaintenance maintenance) throws Exception {
		IMaintenanceService.updateTMaintenance(maintenance);
		TLog log = new TLog(2, "修改维修信息", new Date());
		logService.insertLog(log);
	}

	// 跳转查看维修详情
	@RequestMapping("/toShowRepair/{id}")
	public String selectRepairManager(Model model, @PathVariable int id) throws Exception {
		BuildMaintenance buildMaintenance = buildIMaintenanceService.selectBuildMaintenanceById(id);
		Integer buildId = buildMaintenance.getBuildId();
		Integer maintenanceId = buildMaintenance.getMaintenanceId();
		TBuild build = buildService.selectBuildById(buildId);
		TMaintenance maintenance = IMaintenanceService.selecTMaintenance(maintenanceId);
		buildMaintenance.setBuild(build);
		buildMaintenance.setMaintenance(maintenance);
		model.addAttribute("buildMaintenance", buildMaintenance);
		return "/admin/showRepair.jsp";
	}

	// 删除维修信息表的内容和对应的维修记录
	@RequestMapping("/toDeleteRepair/{id}")
	public @ResponseBody void deleteRepairManager(@PathVariable int id) throws Exception {
		Integer maintenanceId = buildIMaintenanceService.selectBuildMaintenanceById(id).getMaintenanceId();
		buildIMaintenanceService.deleteBuildMaintenance(id);
		IMaintenanceService.deleteTMaintenance(maintenanceId);
		TLog log = new TLog(2, "删除维修信息", new Date());
		logService.insertLog(log);
	}
}
