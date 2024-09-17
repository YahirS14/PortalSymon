package com.symon.portal.infrastructure.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Setter
@Getter
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Name is required")
    @Size(min = 1, max = 80, message = "Name must be between 1 and 80 characters")
    @Column(name = "name")
    private String name;

    @NotNull(message = "LastName is required")
    @Size(min = 1, max = 80, message = "LastName must be between 1 and 80 characters")
    @Column(name = "last_name")
    private String lastName;

    @NotNull(message = "Age is required")
    @Column(name = "age")
    private LocalDate age;

    @NotNull(message = "Email is required")
    @Size(min = 5, max = 100, message = "Email must be between 5 and 100 characters")
    @Column(name = "email")
    private String email;

    @NotNull(message = "Phone is required")
    @Size(max = 10, message = "Phone must be 10 characters")
    @Column(name = "phone")
    private String phone;

    @NotNull(message = "Password is required")
    @Size(min = 12, max = 160, message = "Password must be between 12 and 160 characters")
    @Column(name = "password")
    private String password;

    @NotNull(message = "validator is required")
    @Column(name = "validator")
    private boolean isValidator;

    @NotNull(message = "isAccountVerified is required")
    @Column(name = "is_account_verified")
    private boolean isAccountVerified;

    @NotNull(message = "isTwoFactorEnabled is required")
    @Column(name = "is_two_factor_enabled")
    private boolean isTwoFactorEnabled;

    @NotNull(message = "createdAt is required")
    @Column(name = "created_date")
    private LocalDateTime createdAt;
}
