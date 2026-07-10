package com.example.demo.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

//
@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .formLogin(httpForm -> {
                    httpForm
                            // ezel jelzed hogy nem a beéptett login akarod hasznali hanem amit megirtal a
                            // /logni API endpointra
                            .loginPage("/login").permitAll(); // permintAll => nem kell semmi ellenerőzés hogy elérjed
                })
                .authorizeHttpRequests(registry -> {
                    registry.requestMatchers("/req/signup").permitAll();
                    registry.anyRequest().authenticated();
                })

                .build(); // spring securty inditása (ami előte van az csak az dekraéljuk hogy az
                          // alapéréekmezet helyett mi fusson)
    }
}
