package com.test.secu.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.test.secu.user.service.UserInfoService;

@Configuration
public class BeanConfig {
	@Bean
	PasswordEncoder passEncoder() {
		return new BCryptPasswordEncoder();
	}

}
