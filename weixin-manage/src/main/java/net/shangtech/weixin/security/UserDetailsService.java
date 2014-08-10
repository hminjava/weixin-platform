package net.shangtech.weixin.security;

import java.util.LinkedList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		System.out.println("=================loadUserByUsername=====================");
		List<GrantedAuthority> gas = new LinkedList<GrantedAuthority>();
		gas.add(new SimpleGrantedAuthority("ROLE_USER"));
		User user = new User(username, "123456", true, true, true, true, gas);
		return user;
	}

}
