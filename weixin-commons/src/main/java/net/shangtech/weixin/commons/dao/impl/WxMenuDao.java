package net.shangtech.weixin.commons.dao.impl;

import java.util.List;

import net.shangtech.framework.spring.annotation.hibernate3.impl.BaseDao;
import net.shangtech.weixin.commons.dao.IWxMenuDao;
import net.shangtech.weixin.commons.entity.WxMenu;

import org.springframework.stereotype.Repository;

@Repository
public class WxMenuDao extends BaseDao<WxMenu> implements IWxMenuDao {

	public List<WxMenu> findBySysUser(int sysUserId) {
		List<WxMenu> list = find("where sysUserId=? and parentId=0 order by sort", sysUserId);
		for(WxMenu menu : list){
			List<WxMenu> children = find("where parentId=? order by sort", menu.getId());
			menu.setChildren(children);
			if(children != null && !children.isEmpty())
				menu.setHasChildren(true);
		}
		return list;
	}

}
