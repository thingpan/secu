package com.test.secu.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import com.test.secu.user.service.UserInfoService;

@Configuration
public class SecurityBeanConfig {

	@Autowired

	private UserInfoService userService;

	@Bean

	SecurityFilterChain securityFilterChain(HttpSecurity hs) throws Exception {

		hs.authorizeRequests(req -> req.antMatchers("/login", "/join", "/html/login", "/html/join")// 람다식을 이용함 밑이랑 똑같음

				.permitAll()

				.anyRequest().authenticated())

				.formLogin(formLogin -> formLogin

						.loginPage("/html/login")

						.usernameParameter("uiId")

						.passwordParameter("uiPwd")

						.loginProcessingUrl("/login")

						.defaultSuccessUrl("/")

						.failureUrl("/html/login-fail"))

				.csrf(csfr -> csfr.disable())

				.userDetailsService(userService);

		return hs.build();

	}

}
