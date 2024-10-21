package com.ebaad.SpringSecurityOAuth2Project.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .authorizeHttpRequests(register -> {
                    register.requestMatchers("/").permitAll();
                    register.anyRequest().authenticated();
                })
                // .oauth2Login(Customizer.withDefaults())
                .oauth2Login(oauth2Login -> {
                    oauth2Login
                            .loginPage("/login")
                            .successHandler(((request, response, authentication) -> response.sendRedirect("/profile")));
                })
                // .formLogin(Customizer.withDefaults())
                .build();
    }
}
