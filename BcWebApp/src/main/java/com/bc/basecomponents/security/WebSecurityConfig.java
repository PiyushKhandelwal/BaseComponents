package com.bc.basecomponents.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers("/resources/**").permitAll()
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/dba/**").hasRole("DBA")
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .defaultSuccessUrl("/home",true)
                .permitAll()
                .and()
                .rememberMe()
                .key("COM_BC_BASECOMPONENTS")
                .rememberMeParameter("rememberme")
                .rememberMeCookieName("COM_BC_BASECOMPONENTS")
                .tokenValiditySeconds(86400)
                .and()
                .logout()
                .logoutSuccessUrl("/login?logout")
                .deleteCookies("JSESSIONID");
    }
}
