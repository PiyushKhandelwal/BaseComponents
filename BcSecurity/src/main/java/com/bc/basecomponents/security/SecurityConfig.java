package com.bc.basecomponents.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.sql.DataSource;

@EnableWebSecurity
public class SecurityConfig  {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("123456").roles("USER").and()
                .withUser("admin").password("123456").roles("ADMIN").and()
                .withUser("dba").password("123456").roles("DBA");
        /*auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select name, password, enabled from users where name=?")
                .authoritiesByUsernameQuery("select u.name, r.rolename from users u, " +
                        "roles r,  userroles ur where ur.user_id=ur.role_id and ur.user_id= u.id " +
                        "and ur.role_id=r.id and u.name=?");*/
    }
}
