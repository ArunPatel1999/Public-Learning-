package com.security.service;

import java.util.Collection;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;



public class UserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = 1L;

	private String username;

	private String password;

	public UserDetailsImpl(String username,String password) {
		this.username = username;
		this.password = password;
		}

	public static UserDetailsImpl build(Map<String, String> map) {
		return new UserDetailsImpl(map.get("username"),
				map.get("password"));
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return null;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
