package net.shangtech.weixin.commons.controller;

import javax.servlet.http.HttpServletRequest;

import net.shangtech.framework.springmvc.BaseController;
import net.shangtech.weixin.commons.entity.WxMenu;
import net.shangtech.weixin.commons.service.IWxMenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/" + WxMenuController.PATH)
public class WxMenuController extends BaseController {
	
	public static final String PATH = "service/wxmenu";
	
	@Autowired private IWxMenuService service;
	
	@RequestMapping("/index")
	public String index(){
		
		return PATH + "/index";
	}
	
	@RequestMapping("/add")
	public String add(HttpServletRequest request){
		return PATH + "/form";
	}
	
	@ResponseBody
	@RequestMapping("/{action}/save")
	public String save(WxMenu wxmenu){
		
		return null;
	}
}
