package net.shangtech.weixin.security;

import net.shangtech.weixin.commons.entity.SysUser;
import net.shangtech.weixin.commons.service.ISysUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

public class JdbcAuthenticationProvider implements AuthenticationProvider {

	@Autowired
	private ISysUserService service;
	
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		UserDetails details = (UserDetails) authentication.getPrincipal();
		String username = details.getUsername();
		String password = details.getPassword();
		SysUser user = service.findByUsername(username);
		
		return null;
	}

	public boolean supports(Class<?> clazz) {
		return false;
	}

}
