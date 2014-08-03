package net.shangtech.weixin.commons.service;

import java.util.List;

import net.shangtech.weixin.commons.entity.WxMenu;

public interface IWxMenuService {
	List<WxMenu> findBySysUser(int sysUserId);
}
