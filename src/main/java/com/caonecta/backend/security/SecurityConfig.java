package com.caonecta.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Desabilita o CSRF (necessário para APIs REST)
                .csrf(csrf -> csrf.disable())

                // Libera explicitamente qualquer requisição sem pedir autenticação/login
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll()
                )

                // Desativa o formulário de login padrão do Spring que apareceu para você
                .formLogin(form -> form.disable())
                .httpBasic(basic -> basic.disable());

        return http.build();
    }
}