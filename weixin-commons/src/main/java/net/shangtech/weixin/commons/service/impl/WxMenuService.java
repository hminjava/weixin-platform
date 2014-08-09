package net.shangtech.weixin.commons.service.impl;

import java.util.List;

import net.shangtech.framework.impl.BaseService;
import net.shangtech.weixin.commons.dao.IWxMenuDao;
import net.shangtech.weixin.commons.entity.WxMenu;
import net.shangtech.weixin.commons.service.IWxMenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WxMenuService extends BaseService<WxMenu> implements IWxMenuService {
	@Autowired private IWxMenuDao dao;
	public List<WxMenu> findBySysUser(int sysUserId) {
		return dao.findBySysUser(sysUserId);
	}

}
