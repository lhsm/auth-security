package com.github.lhsm.auth.jwt;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.lhsm.auth.AuthHolder;
import com.github.lhsm.auth.model.Authentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwtRequestFilter extends OncePerRequestFilter {

    private static final Logger LOGGER = LoggerFactory.getLogger(JwtRequestFilter.class);

    private final ObjectMapper jsonParser = new ObjectMapper();

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        try {
            String header = request.getHeader("Authorization");

            if (header != null && header.startsWith("Bearer ")) {
                Authentication auth = jsonParser.readValue(JwtHelper.decode(header.split(" ")[1]).getClaims(), Authentication.class);
                AuthHolder.set(auth);
                LOGGER.debug("{}", auth);
            }

            filterChain.doFilter(request, response);
        } finally {
            AuthHolder.reset();
        }
    }

}
