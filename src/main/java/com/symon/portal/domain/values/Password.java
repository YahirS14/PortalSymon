package com.symon.portal.domain.values;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class Password {

    private final String hashedPassword;

    public Password(String password) {
        this.hashedPassword = hashPassword(password);
    }

    private String hashPassword(String password) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        return passwordEncoder.encode(password);
    }

    @Override
    public String toString() {
        return hashedPassword;
    }
}
