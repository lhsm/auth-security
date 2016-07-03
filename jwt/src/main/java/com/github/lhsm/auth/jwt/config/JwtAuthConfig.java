package com.github.lhsm.auth.jwt.config;

import com.github.lhsm.auth.jwt.JwtRequestFilter;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtAuthConfig {

    @Bean
    public FilterRegistrationBean profileFilterRegistrationBean() {
        FilterRegistrationBean filterRegBean = new FilterRegistrationBean();
        filterRegBean.setFilter(new JwtRequestFilter());
        filterRegBean.setOrder(SecurityProperties.DEFAULT_FILTER_ORDER - 10);
        return filterRegBean;
    }

}
