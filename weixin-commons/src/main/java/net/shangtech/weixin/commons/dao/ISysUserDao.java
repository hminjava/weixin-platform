package net.shangtech.weixin.commons.dao;

import net.shangtech.framework.spring.IBaseDao;
import net.shangtech.weixin.commons.entity.SysUser;

/**
 * @author songxh
 * @createtime 2014-8-3下午08:56:43
 */
public interface ISysUserDao extends IBaseDao<SysUser> {
	/**
	 * 根据用户名查找记录,返回查询结果第一条
	 * @author songxh
	 * @createtime 2014-8-3下午08:58:14
	 * @param username
	 * @return
	 */
	SysUser findByUsername(String username);
}
