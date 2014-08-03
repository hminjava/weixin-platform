package net.shangtech.weixin.commons.dao.impl;

import net.shangtech.framework.spring.annotation.hibernate3.impl.BaseDao;
import net.shangtech.weixin.commons.dao.ISysUserDao;
import net.shangtech.weixin.commons.entity.SysUser;

import org.springframework.stereotype.Repository;

@Repository
public class SysUserDao extends BaseDao<SysUser> implements ISysUserDao {

	public SysUser findByUsername(String username) {
		return findUnique("where username=?", username);
	}
	
}
