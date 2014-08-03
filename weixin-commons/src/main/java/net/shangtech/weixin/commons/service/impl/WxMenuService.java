package net.shangtech.weixin.commons.service.impl;

import java.util.List;

import net.shangtech.framework.impl.BaseService;
import net.shangtech.weixin.commons.dao.impl.WxMenuDao;
import net.shangtech.weixin.commons.entity.WxMenu;
import net.shangtech.weixin.commons.service.IWxMenuService;

import org.springframework.beans.factory.annotation.Autowired;

public class WxMenuService extends BaseService<WxMenu> implements IWxMenuService {
	@Autowired private WxMenuDao dao;
	public List<WxMenu> findBySysUser(int sysUserId) {
		return dao.findBySysUser(sysUserId);
	}

}
