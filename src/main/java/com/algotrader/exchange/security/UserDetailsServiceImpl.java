package com.algotrader.exchange.security;

import com.algotrader.exchange.exception.NoUserException;
import com.algotrader.exchange.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(final String name) throws UsernameNotFoundException {

        var user = userRepository.findByName(name)
                .stream()
                .findFirst()
                .orElseThrow(NoUserException::new);

        return SecurityUser.fromUser(user);
    }
}
