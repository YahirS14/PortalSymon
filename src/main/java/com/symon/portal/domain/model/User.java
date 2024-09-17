package com.symon.portal.domain.model;

import com.symon.portal.domain.values.Password;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class User {
    private String username;
    private String lastName;
    private LocalDate age;
    private String email;
    private String phone;
    private Password password;

    private boolean isValidator;

    private boolean isAccountVerified;
    private boolean isTwoFactorEnabled;

    private LocalDateTime createdAt;

    public User(String username, String lastName, LocalDate age, String email, String phone, String password) {
        this.username = username;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.password = new Password(password);
        this.isValidator = false;
        this.isAccountVerified = false;
        this.isTwoFactorEnabled = false;
        this.createdAt = LocalDateTime.now();
    }

}
