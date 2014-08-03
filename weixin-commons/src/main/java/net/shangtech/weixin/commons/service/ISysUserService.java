package net.shangtech.weixin.commons.service;

import net.shangtech.framework.spring.IBaseService;
import net.shangtech.weixin.commons.entity.SysUser;

public interface ISysUserService extends IBaseService<SysUser> {
	SysUser findByUsername(String username);
}
