package com.github.lhsm.auth.security;

import com.github.lhsm.auth.model.Principal;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.preauth.PreAuthenticatedGrantedAuthoritiesUserDetailsService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PreAuthenticatedService extends PreAuthenticatedGrantedAuthoritiesUserDetailsService {

    private final static GrantedAuthority DEFAULT_ROLE = new SimpleGrantedAuthority("ROLE_USER");// TODO: 29.04.2016 external resolver

    @Override
    protected UserDetails createUserDetails(Authentication token, Collection<? extends GrantedAuthority> authorities) {
        Set<GrantedAuthority> roles = new HashSet<>(token.getAuthorities());
        roles.add(DEFAULT_ROLE);
        return new User(
                getPersonId(token.getPrincipal()),
                token.getCredentials().toString(),
                roles
        );
    }

    @SuppressWarnings("unchecked")
    private static String getPersonId(Object principal) {
        return ((Principal) principal).getPrsId();
    }

}
