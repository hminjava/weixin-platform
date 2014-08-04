package net.shangtech.weixin.commons.controller;

import net.shangtech.framework.springmvc.BaseController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/service/wxmenu")
public class WxMenuController extends BaseController {
	
	@RequestMapping("/index")
	public String index(){
		
		return "wxmenu/index";
	}
}
