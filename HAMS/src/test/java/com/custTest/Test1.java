package com.custTest;

import java.awt.Image;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.sust.bean.BuildImage;
import com.sust.bean.BuildMake;
import com.sust.bean.TBuild;
import com.sust.bean.TBulletin;
import com.sust.bean.TImage;
import com.sust.bean.TMake;
import com.sust.bean.TMaterial;
import com.sust.bean.TTechnique;
import com.sust.bean.TUser;
import com.sust.dao.TBulletinMapper;
import com.sust.service.IBuildMakeService;
import com.sust.service.IBuildMaterialService;
import com.sust.service.IBuildTechniqueService;
import com.sust.service.IBulidServcie;
import com.sust.service.IBulletinServcie;
import com.sust.service.ILogServcie;
import com.sust.service.impl.BulletinImpl;
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-dao.xml",
									"classpath:spring/spring-service.xml",
									"classpath:spring/spring-web.xml"})
public class Test1 {
	
	/*@Autowired 
	private IBulidServcie buildService;*/
	@Autowired
	//private IBulletinServcie BulletinServcieImpl;
	private IBulidServcie buildService;
	
	@Autowired
	private IBuildMakeService buildmake;
	@Autowired 
	private IBuildMaterialService buildMater;
	@Autowired IBuildTechniqueService buildTechniqueServcie;
	
	
	
	@Test
	public void BulletinIml() throws Exception {
		//List<TBuild> selectAllBuilds = buildService.selectAllBuilds();
		//ibulletinServcie.selectTBulletinByDate();
		/*for (TBuild tBuild : selectAllBuilds) {
			System.out.println(tBuild);
		}*/
		/*List<TBulletin> selectAllBulletins = BulletinServcieImpl.selectAllBulletins();
		for (TBulletin tBulletin : selectAllBulletins) {
			System.out.println(tBulletin);
		}*/
//		TBuild selectBuildById = buildService.selectBuildById(1);
//		TUser user = selectBuildById.getUser();
//		System.out.println(user);
		
//		List<TBuild> selectByBuildId = buildmake.selectByBuildId(2);
//		for (TBuild tBuild : selectByBuildId) {
//			List<TMake> lmake = tBuild.getLmake();
//			for (TMake make : lmake) {
//				System.out.println(make.getName());
//			}
//		}
		/*
		 * List<TBuild> selectByBuildId = buildmake.selectByBuildId(2); for (TBuild
		 * tBuild : selectByBuildId) { List<TMake> lmake = tBuild.getLmake(); for (TMake
		 * make : lmake) { System.out.println(make); }
		 * System.out.println(",,,,,"+tBuild.getLmake());
		 * 
		 * }
		 */
		/*
		 * List<TBuild> selectMaterialByBuildId = buildMater.selectMaterialByBuildId(2);
		 * for (TBuild tBuild : selectMaterialByBuildId) {
		 * System.out.println("-------"+tBuild); List<TMaterial> materrial =
		 * tBuild.getLmaterrial(); for (TBuild tBuild2 : selectMaterialByBuildId) {
		 * System.out.println(tBuild2); } }
		 */
//		List<TBuild> selectTechniqueByBuildId = buildTechniqueServcie.selectTechniqueByBuildId(2);
//		for (TBuild tBuild1: selectTechniqueByBuildId) {
//			List<TTechnique> ltechnique = tBuild1.getLtechnique();
//			for (TTechnique technique : ltechnique) {
//				System.out.println(technique);
//
//			}

//			System.out.println(",,,,,"+tBuild.getLmake());
			
//		}
		List<BuildImage> selectImageByBuildId = buildmake.selectImageByBuildId(2);
		for (BuildImage buildImage : selectImageByBuildId) {
			System.out.println(buildImage.getImage());
		}
	}
}
		

