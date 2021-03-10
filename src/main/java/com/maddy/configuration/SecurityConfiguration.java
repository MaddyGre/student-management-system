package com.maddy.configuration;



import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().passwordEncoder(new BCryptPasswordEncoder())
			.dataSource(dataSource)
			.usersByUsernameQuery("select username, password, enabled from admin where username = ?")
			.authoritiesByUsernameQuery("select username, role from admin where username = ?");
			
	}
	
	@Override
	protected void configure(final HttpSecurity http) throws Exception {
		
		http
			.authorizeRequests()
			.anyRequest().authenticated()
			.and()
			.formLogin().permitAll()
			.and()
			.logout().permitAll();
		
	}
	
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//		.passwordEncoder(new BCryptPasswordEncoder())
//		.withUser("admin")
//		.password("$2a$10$2nCWPQoPdPFcjIvypKEXyeksAvEp0npAnnB/./QBRxoj3/84UIGIK")
//		.roles("ADMIN");
	
	//users : $2a$10$572p/.5u5EK6Ko.jIyk/DeoWUWmW5chVQcijwdM6lAkHv6v6EcYpC
//		
//	}
	



}
