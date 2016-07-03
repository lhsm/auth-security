package com.github.lhsm.auth.security.config;

import com.github.lhsm.auth.security.DefaultAuthenticationSuccessHandler;
import com.github.lhsm.auth.security.PreAuthenticatedService;
import com.github.lhsm.auth.security.StatusAccessDeniedHandler;
import com.github.lhsm.auth.security.UnauthorizedAuthenticationEntryPoint;
import com.github.lhsm.auth.security.AuthenticationFilter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.ProviderManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedAuthenticationProvider;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.Collections;

@Configuration
@EnableAspectJAutoProxy
@EnableWebSecurity
@Order(SecurityProperties.BASIC_AUTH_ORDER - 10)
public class AuthWebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Value("${jwt.requestPath}")
    private String requestPath;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .requestMatchers()
                .antMatchers(requestPath)
                .and()
                .authorizeRequests()
                .anyRequest().permitAll()
                .and()
                .exceptionHandling()
                .authenticationEntryPoint(new UnauthorizedAuthenticationEntryPoint())
                .accessDeniedHandler(new StatusAccessDeniedHandler())
                .and()
                .csrf()
                .disable()
                .addFilterBefore(jwtFilter(), UsernamePasswordAuthenticationFilter.class)
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .sessionFixation().none()
        ;
    }

    public AuthenticationFilter jwtFilter() {
        AuthenticationFilter filter = new AuthenticationFilter(new AntPathRequestMatcher(requestPath));
        filter.setAuthenticationManager(authenticationManager());
        filter.setAuthenticationSuccessHandler(new DefaultAuthenticationSuccessHandler());
        return filter;
    }

    @Override
    public AuthenticationManager authenticationManager() {
        PreAuthenticatedAuthenticationProvider provider = new PreAuthenticatedAuthenticationProvider();
        provider.setPreAuthenticatedUserDetailsService(new PreAuthenticatedService());

        return new ProviderManager(Collections.singletonList(provider));
    }

}