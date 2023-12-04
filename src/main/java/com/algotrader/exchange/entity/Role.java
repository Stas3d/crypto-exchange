package com.algotrader.exchange.entity;

import lombok.Getter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
public enum Role {

//    NON_AUTHORIZED_USER("NON_AUTHORIZED"),
//    NON_REGISTERED_USER("NON_REGISTERED"),
//    AUTHORIZED_USER("AUTHORIZED"),
//    ADMIN_USER("ADMIN"),
//    SUPER_ADMIN_USER("SUPER_ADMIN"),
//    NEW_USER("NEW");

    USER(Set.of(Permission.DEVELOPERS_READ)),
    ADMIN(Set.of(Permission.DEVELOPERS_READ, Permission.DEVELOPERS_WRITE)),
    DEFAULT(Collections.EMPTY_SET)
    ;

    private final Set<Permission> permissions;

    Role(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public Set<SimpleGrantedAuthority> getAuthorities() {
        return getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
    }

    public static Optional<Role> find(final String role) {

        return Arrays.stream(values())
                .filter(it -> it.name().equals(role))
                .findFirst();
    }
}
