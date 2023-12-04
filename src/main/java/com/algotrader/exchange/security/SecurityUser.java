package com.algotrader.exchange.security;

import lombok.Data;
import com.algotrader.exchange.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
public class SecurityUser implements UserDetails {

    private final String userName;
    private final String pwd;
    private final List<SimpleGrantedAuthority> authorities;
    private final boolean isActive;
    private final boolean isAccountNonExpired;
    private final boolean isAccountNonLocked;
    private final boolean isCredentialsNonExpired;
    private final boolean isEnabled;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return pwd;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    public static UserDetails fromUser(User user) {

        return new org.springframework.security.core.userdetails.User(
                user.getName(),
                user.getPwd(),
                user.getEnabled(),
                user.getAccountNonExpired(),
                user.getCredentialsNonExpired(),
                user.getAccountNonLocked(),
                user.getRole().getAuthorities());
    }
}
