package com.bc.basecomponents.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import javax.sql.DataSource;

@EnableWebSecurity
@ImportResource("classpath:META-INF/conf/applicationContext.xml")
public class SecurityConfig  {

    private @Autowired DataSource dataSource;

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        /*auth.inMemoryAuthentication()
                .withUser("user").password("123456").roles("USER").and()
                .withUser("admin").password("123456").roles("ADMIN").and()
                .withUser("dba").password("123456").roles("DBA");*/
        auth.jdbcAuthentication()
                .dataSource(dataSource)
                .usersByUsernameQuery("select name, password, enabled  from bc_users where name=?")
                .authoritiesByUsernameQuery("select u.name, r.rolename from bc_users u, " +
                        "bc_roles r,  bc_userroles ur where ur.user_id=ur.role_id and ur.user_id= u.id " +
                        "and ur.role_id=r.id and u.name=?");
    }
}
