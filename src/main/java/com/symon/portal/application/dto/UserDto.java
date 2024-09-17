package com.symon.portal.application.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserDto {
    private String username;
    private String lastName;
    private LocalDate age;
    private String email;
    private String phone;
    private String password;
}
