package com.github.lhsm.auth.security;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.security.access.expression.method.DefaultMethodSecurityExpressionHandler;
import org.springframework.security.core.Authentication;

public class MethodSecurityExpressionHandler extends DefaultMethodSecurityExpressionHandler {

    @Override
    protected MethodSecurityExpressionOperations createSecurityExpressionRoot(Authentication authentication, MethodInvocation invocation) {
        return new MethodSecurityExpressionOperations(super.createSecurityExpressionRoot(authentication, invocation));
    }

    @Override
    protected org.springframework.security.access.PermissionEvaluator getPermissionEvaluator() {
        return new PermissionEvaluator();
    }

}
