package com.algotrader.exchange.entity;

import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "users")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private long id;

    @Column(name = "user_name", nullable = false, unique = true)
    private String name;

    @Column(name = "user_email", nullable = false, unique = true)
    private String email;

    @Column(name = "user_phone")
    private String phone;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "user_role")
    private Role role;

    @Column(name = "user_pwd", nullable = false)
    private String pwd;

    @Column(name = "user_authorities")
    private String authorities;

    @Column(name = "user_last_pwd_changed")
    private Date pwdChanged;

    @Column(name = "secondary_email", unique = true)
    private String secEmail;

//    @Column(name = "created_on")
//    private Date createdOn;

    @Column(name = "phone_verified")
    private Boolean verifiedPhone;

    @Column(name = "user_gender")
    private Gender gender;

    @Column(name = "account_non_expired")
    private Boolean accountNonExpired;

    @Column(name = "account_non_locked")
    private Boolean accountNonLocked;

    @Column(name = "credentials_non_expired")
    private Boolean credentialsNonExpired;

    @Column(name = "user_enabled")
    private Boolean enabled;

    public User(String name,
                String email,
                String phone,
                String gender,
                String role,
                String pwd) {

        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = Gender.find(gender).orElse(Gender.OTHER);
        this.role = Role.find(role).orElse(Role.DEFAULT);
        this.pwd = pwd;
//        this.createdOn = new Date();
        this.verifiedPhone = Boolean.FALSE;
        this.pwdChanged = new Date();
        this.accountNonExpired = Boolean.TRUE;
        this.accountNonLocked = Boolean.TRUE;
        this.credentialsNonExpired = Boolean.TRUE;
        this.enabled = Boolean.TRUE;
    }
}
