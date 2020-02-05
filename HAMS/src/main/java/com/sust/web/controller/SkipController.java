package com.sust.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SkipController {
	@RequestMapping("skipLogin")
	public String skipLogin() {
		return "login.jsp";
	}
	@RequestMapping("skipRegister")
	public String skipRegister() {
		return "register.jsp";
	}
	/*
	 * @RequestMapping("/skipCollection") public String skipCollection() { return
	 * "index.jsp"; }
	 */
}
