package net.shangtech.weixin.commons.service.impl;

import net.shangtech.framework.impl.BaseService;
import net.shangtech.weixin.commons.dao.ISysUserDao;
import net.shangtech.weixin.commons.entity.SysUser;
import net.shangtech.weixin.commons.service.ISysUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysUserService extends BaseService<SysUser> implements ISysUserService {
	
	@Autowired private ISysUserDao dao;
	
	@Transactional(readOnly = true)
	public SysUser findByUsername(String username) {
		return dao.findByUsername(username);
	}
	
}
