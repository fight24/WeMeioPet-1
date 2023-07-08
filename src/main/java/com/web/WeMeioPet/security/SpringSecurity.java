package com.web.WeMeioPet.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SpringSecurity {
	public BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
	public String passwordEncode(String password) {
		return bCryptPasswordEncoder.encode(password);
	}
}
