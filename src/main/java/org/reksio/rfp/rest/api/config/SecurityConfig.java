package org.reksio.rfp.rest.api.config;

import com.auth0.spring.security.api.JwtWebSecurityConfigurer;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * SecurityConfig
 */
@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        JwtWebSecurityConfigurer
                .forHS256("bnfxoXissI8s994nBSDqUhdqOCgZbMde", "https://spuu.eu.auth0.com/", "PSqJkxyOOx5RRF-p39GO0-q6e_sfAk1jai6BiymC6ogZQufOPZaZMDABk8Q_7erE".getBytes())
                .configure(http)
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated();
    }
}
