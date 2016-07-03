package com.github.lhsm.auth.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;

public class PermissionEvaluator implements org.springframework.security.access.PermissionEvaluator {

    @Override
    public boolean hasPermission(Authentication authentication, Object targetDomainObject, Object permission) {
        return targetDomainObject != null && targetDomainObject.equals(getPersonId(authentication.getPrincipal()));
    }

    @Override
    public boolean hasPermission(Authentication authentication, Serializable targetId, String targetType, Object permission) {
        throw new UnsupportedOperationException();
    }

    private static String getPersonId(Object principal) {
        return ((UserDetails) principal).getUsername();
    }

}
