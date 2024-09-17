package com.symon.portal.domain.factory;

import com.symon.portal.domain.model.User;

import java.time.LocalDate;

public class UserFactory {

    public static User createUser(String username, String lastName, LocalDate age, String email, String phone, String password) {
        return new User(username, lastName, age, email, phone, password);
    }
}