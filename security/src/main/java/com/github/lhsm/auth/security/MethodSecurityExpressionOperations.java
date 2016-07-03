package com.github.lhsm.auth.security;

import org.springframework.security.core.Authentication;

import java.util.Objects;

public class MethodSecurityExpressionOperations implements org.springframework.security.access.expression.method.MethodSecurityExpressionOperations {

    private final org.springframework.security.access.expression.method.MethodSecurityExpressionOperations source;

    public MethodSecurityExpressionOperations(org.springframework.security.access.expression.method.MethodSecurityExpressionOperations source) {
        this.source = Objects.requireNonNull(source);
    }

    @Override
    public Authentication getAuthentication() {
        return source.getAuthentication();
    }

    @Override
    public boolean hasAuthority(String authority) {
        return source.hasAuthority(authority);
    }

    @Override
    public boolean hasAnyAuthority(String... authorities) {
        // TODO: 26.04.2016 check remotely
        return source.hasAnyAuthority(authorities);
    }

    @Override
    public boolean hasRole(String role) {
        return source.hasRole(role);
    }

    @Override
    public boolean hasAnyRole(String... roles) {
        return source.hasAnyRole(roles);
    }

    @Override
    public boolean permitAll() {
        return source.permitAll();
    }

    @Override
    public boolean denyAll() {
        return source.denyAll();
    }

    @Override
    public boolean isAnonymous() {
        return source.isAnonymous();
    }

    @Override
    public boolean isAuthenticated() {
        return source.isAuthenticated();
    }

    @Override
    public boolean isRememberMe() {
        return source.isRememberMe();
    }

    @Override
    public boolean isFullyAuthenticated() {
        return source.isFullyAuthenticated();
    }

    @Override
    public boolean hasPermission(Object target, Object permission) {
        return source.hasPermission(target, permission);
    }

    @Override
    public boolean hasPermission(Object targetId, String targetType, Object permission) {
        return source.hasPermission(targetId, targetType, permission);
    }

    @Override
    public void setFilterObject(Object filterObject) {
        source.setFilterObject(filterObject);
    }

    @Override
    public Object getFilterObject() {
        return source.getFilterObject();
    }

    @Override
    public void setReturnObject(Object returnObject) {
        source.setReturnObject(returnObject);
    }

    @Override
    public Object getReturnObject() {
        return source.getReturnObject();
    }

    @Override
    public Object getThis() {
        return source.getThis();
    }

}
