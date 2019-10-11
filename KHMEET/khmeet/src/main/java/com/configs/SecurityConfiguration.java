package com.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/api/user/**").permitAll()
                .antMatchers(HttpMethod.POST,"/api/user/**").permitAll()
                .antMatchers(HttpMethod.GET,"/api/user/**").permitAll()
                .antMatchers(HttpMethod.PUT,"/api/user/**").permitAll()
                .antMatchers(HttpMethod.DELETE,"/api/user/**").permitAll()
                .antMatchers("/api/hashTag/**").permitAll()
                .antMatchers(HttpMethod.POST,"/api/hashTag/**").permitAll()
                .antMatchers(HttpMethod.GET,"/api/hashTag/**").permitAll()
                .antMatchers(HttpMethod.PUT,"/api/hashTag/**").permitAll()
                .antMatchers(HttpMethod.DELETE,"/api/hashTag/**").permitAll()
                .antMatchers("/api/article/**").permitAll()
                .antMatchers(HttpMethod.POST,"/api/article/**").permitAll()
                .antMatchers(HttpMethod.GET,"/api/article/**").permitAll()
                .antMatchers(HttpMethod.PUT,"/api/article/**").permitAll()
                .antMatchers(HttpMethod.DELETE,"/api/article/**").permitAll()
                .antMatchers("/api/favourite/**").permitAll()
                .antMatchers(HttpMethod.POST,"/api/favourite/**").permitAll()
                .antMatchers(HttpMethod.GET,"/api/favourite/**").permitAll()
                .antMatchers(HttpMethod.PUT,"/api/favourite/**").permitAll()
                .antMatchers(HttpMethod.DELETE,"/api/favourite/**").permitAll()
                .antMatchers("/api/favourite/**").permitAll()
                .antMatchers(HttpMethod.POST,"/api/hobby/**").permitAll()
                .antMatchers(HttpMethod.GET,"/api/hobby/**").permitAll()
                .antMatchers(HttpMethod.PUT,"/api/hobby/**").permitAll()
                .antMatchers(HttpMethod.DELETE,"/api/hobby/**").permitAll()
                .antMatchers("/api/favourite/**").permitAll()
                .antMatchers(HttpMethod.POST,"/api/typeHobby/**").permitAll()
                .antMatchers(HttpMethod.GET,"/api/typeHobby/**").permitAll()
                .antMatchers(HttpMethod.PUT,"/api/typeHobby/**").permitAll()
                .antMatchers(HttpMethod.DELETE,"/api/typeHobby/**").permitAll()
                .anyRequest().authenticated();
    }
}
