package net.shangtech.weixin.commons.dao;

import java.util.List;

import net.shangtech.framework.spring.IBaseDao;
import net.shangtech.weixin.commons.entity.WxMenu;

public interface IWxMenuDao extends IBaseDao<WxMenu> {
	/**
	 * 查询系统用户微信平台的菜单信息
	 * @author songxh
	 * @createtime 2014-8-3下午09:05:23
	 * @param sysUserId
	 * @return
	 */
	List<WxMenu> findBySysUser(int sysUserId);
}
