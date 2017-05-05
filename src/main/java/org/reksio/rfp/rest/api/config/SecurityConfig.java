package org.reksio.rfp.rest.api.config;

import com.auth0.spring.security.api.JwtWebSecurityConfigurer;
import org.reksio.rfp.rest.api.services.AuthPropertiesService;
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
                .forHS256(
                        AuthPropertiesService.INSTANCE.getClientId(),
                        AuthPropertiesService.INSTANCE.getIssuer(),
                        AuthPropertiesService.INSTANCE.getSecretKey().getBytes())
                .configure(http)
                .authorizeRequests()
                .antMatchers("/").permitAll()
                .anyRequest().authenticated();
    }
}
