package com.codingshuttle.youtube.hospitalManagement.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

public class WebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(auth->auth
                .requestMatchers("/admin/**").authenticated()
                .requestMatchers("/public/**").permitAll()
        )
                .formLogin(Customizer.withDefaults());
        return http.build();


    }
}
