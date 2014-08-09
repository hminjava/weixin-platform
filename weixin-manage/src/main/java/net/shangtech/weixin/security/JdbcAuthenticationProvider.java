package net.shangtech.weixin.security;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class JdbcAuthenticationProvider implements AuthenticationProvider {

//	@Autowired
//	private ISysUserService service;
	
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
//		UserDetails details = (UserDetails) authentication.getPrincipal();
//		String username = details.getUsername();
//		String password = details.getPassword();
//		SysUser user = service.findByUsername(username);
//		
		return authentication;
	}

	public boolean supports(Class<?> clazz) {
		return false;
	}

}
