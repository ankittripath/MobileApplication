package com.product.mobileApplication.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{  // websecurityconfig is a 	abstract class

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		//configure is default method of websecurityconfig
		PasswordEncoder encoder = 
		          PasswordEncoderFactories.createDelegatingPasswordEncoder();
		System.out.print("test");
		auth.inMemoryAuthentication()
		.withUser("customer").password(encoder.encode("cuspassword")).roles("CUSTOMER")
		.and()
		.withUser("admin").password(encoder.encode("adminpassword")).roles("CUSTOMER","ADMIN");
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		System.out.print("test");
		http.httpBasic()
		     .and()
		     .authorizeRequests()
		     .antMatchers(HttpMethod.GET,"/getAllMobile").hasRole("CUSTOMER")
		     .antMatchers(HttpMethod.GET,"/getAllMobile").hasRole("ADMIN")
		     .antMatchers(HttpMethod.POST,"/addMobile").hasRole("ADMIN")
		     .antMatchers(HttpMethod.PUT,"/updateMobile").hasRole("ADMIN")
		     .antMatchers(HttpMethod.DELETE,"/deleteMobile/{id}").hasRole("ADMIN")
		     .antMatchers(HttpMethod.DELETE,"/deleteAllMobile").hasRole("ADMIN")
		     .and()
		     .csrf().disable()	
		     .formLogin().disable();
	}
}
