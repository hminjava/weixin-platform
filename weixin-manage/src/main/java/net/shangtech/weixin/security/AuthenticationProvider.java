package net.shangtech.weixin.security;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

public class AuthenticationProvider implements org.springframework.security.authentication.AuthenticationProvider {
	private UserDetailsService userDetailsService;
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		System.out.println("=================authenticate=====================");
		UserDetails ud = userDetailsService.loadUserByUsername(authentication.getName());
		Authentication result = new UsernamePasswordAuthenticationToken(ud, authentication.getCredentials(), ud.getAuthorities());
		return result;
	}

	public boolean supports(Class<?> arg0) {
		System.out.println("=================supports=====================");
		System.out.println(arg0.getName());
		return true;
	}

	public UserDetailsService getUserDetailsService() {
		return userDetailsService;
	}

	public void setUserDetailsService(UserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

}
