package com.github.lhsm.auth;

import com.github.lhsm.auth.model.Authentication;
import org.springframework.core.NamedThreadLocal;

import java.util.Optional;

public class AuthHolder {

    private static final ThreadLocal<Authentication> profileHolder = new NamedThreadLocal<>("authentication");

    public static void reset() {
        profileHolder.remove();
    }

    public static void set(Authentication auth) {
        profileHolder.set(auth);
    }

    public static Optional<Authentication> get() {
        return Optional.ofNullable(profileHolder.get());
    }

}
