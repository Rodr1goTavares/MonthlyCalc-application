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
  
  // @Bean
  // public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
  //   return authenticationConfiguration.getAuthenticationManager();
  // }

  // @Bean
  // public PasswordEncoder passwordEncoder() {
  //   return new BCryptPasswordEncoder();
  // }

  @Bean
  public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
    return httpSecurity
      .authorizeHttpRequests((authorizeConfig) -> {
        authorizeConfig.requestMatchers("/").permitAll();
        authorizeConfig.requestMatchers("/logout").permitAll();
        authorizeConfig.requestMatchers("/error").permitAll();
        authorizeConfig.requestMatchers("/test").permitAll();
        authorizeConfig.requestMatchers("/test1").permitAll();
        authorizeConfig.requestMatchers("/test2").permitAll();
        authorizeConfig.requestMatchers("/create").permitAll();// <-- test
        authorizeConfig.requestMatchers(HttpMethod.OPTIONS ,"/create-month").permitAll();// <-- test
        authorizeConfig.anyRequest().authenticated();
      })
      .formLogin(Customizer.withDefaults())
      .build();    
  }
}
