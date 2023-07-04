package br.com.mouthcalc.mounthcalc.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig {

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    return httpSecurity
      .authorizeHttpRequests((authorizeConfig) -> {
        authorizeConfig.requestMatchers("/").permitAll();
        authorizeConfig.requestMatchers("/logout").permitAll();
        authorizeConfig.requestMatchers("/error").permitAll();
        authorizeConfig.requestMatchers(HttpMethod.OPTIONS ,"/months").permitAll();// <-- test
        authorizeConfig.anyRequest().authenticated();
      }).oauth2Login(Customizer.withDefaults()).build();
  }
}
