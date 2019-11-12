package com.kt.security.web.config;

import com.kt.security.web.handler.KtAuthenticationFailureHandler;
import com.kt.security.web.handler.KtAuthenticationSuccessHandler;
import com.kt.security.web.service.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Created with IntelliJ IDEA.
 * Desc:
 *
 * @author: keen
 * Date: 2019-11-06
 * Time: 21:51
 */
@Configuration
public class KtWebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private MyUserDetailsService userDetailsService;

    @Autowired
    private KtAuthenticationSuccessHandler ktAuthenticationSuccessHandler;

    @Autowired
    private KtAuthenticationFailureHandler ktAuthenticationFailureHandler;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin()
                .loginProcessingUrl("/authentication/form")
                .successHandler(ktAuthenticationSuccessHandler)
                .failureHandler(ktAuthenticationFailureHandler)
                .loginPage("/authentication/required")
                .and()
                .userDetailsService(userDetailsService)
                .authorizeRequests()
                .antMatchers("/authentication/required","/kt-signIn.html")
                .permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf().disable();
    }


    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
