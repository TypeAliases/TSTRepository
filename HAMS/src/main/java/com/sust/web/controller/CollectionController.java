package com.sust.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sust.bean.TCollection;
import com.sust.common.MyException;
import com.sust.service.ICollectionService;
@Controller
public class CollectionController {
	@Autowired
	private ICollectionService collectionService;
	
	@RequestMapping("/insertCollections") 
	public String inserCollection(HttpServletRequest request,HttpServletResponse response,Model model) {
		try {
			request.setCharacterEncoding("utf-8");
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			String titleName = request.getParameter("title");
			String context = request.getParameter("mytxtIntro");
			TCollection tCollection = new TCollection();
			tCollection.setName(titleName);
			tCollection.setContext(context);
			collectionService.insertCollection(tCollection);
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Materialcollection.jsp";

	}
	 
 
}
