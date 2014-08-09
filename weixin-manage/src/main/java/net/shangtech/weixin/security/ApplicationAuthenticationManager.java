package net.shangtech.weixin.security;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public class ApplicationAuthenticationManager implements AuthenticationManager {

	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		return authentication;
	}

}
