package com.sust.web.listener;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.sust.bean.TBulletin;
import com.sust.service.IBulletinServcie;
import com.sust.service.impl.BulletinImpl;

/**
 * Application Lifecycle Listener implementation class ApplicationListener
 *
 */
//@WebListener
public class ApplicationListener implements ServletContextListener {
	//@Autowired
	private IBulletinServcie BulletinServcieImpl=new BulletinImpl();

	/**
	 * Default constructor. 
	 */
	public ApplicationListener() {
		// TODO Auto-generated constructor stub
		System.out.println("=================");
	}

	/**
	 * @see ServletContextListener#contextDestroyed(ServletContextEvent)
	 */
	public void contextDestroyed(ServletContextEvent sce)  { 
		// TODO Auto-generated method stub
	}

	/**
	 * @see ServletContextListener#contextInitialized(ServletContextEvent)
	 */
	public void contextInitialized(ServletContextEvent sce)  { 
		System.out.println("================="+BulletinServcieImpl);
		System.err.println("================="+BulletinServcieImpl);
		try {
			List<TBulletin> selectAllBulletins = BulletinServcieImpl.selectAllBulletins();
			for (TBulletin tBulletin : selectAllBulletins) {
				System.out.println(tBulletin);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
//		ServletContext servletContext = sce.getServletContext();
//		 IBulletinServcie = WebApplicationContextUtils.getWebApplicationContext(servletContext).getBean(IBulletinServcie.class);
//		List<TBulletin> allBulletins;
//		try {
//			allBulletins = IBulletinServcie.selectAllBulletins();
//			servletContext.setAttribute("allBulletins", allBulletins);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}

}
