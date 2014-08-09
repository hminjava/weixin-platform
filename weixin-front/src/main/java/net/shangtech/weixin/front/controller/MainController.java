package net.shangtech.weixin.front.controller;

import net.shangtech.framework.springmvc.BaseController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController extends BaseController {
	
	@RequestMapping("login")
	public String loginpage(){
		return "login";
	}
}
