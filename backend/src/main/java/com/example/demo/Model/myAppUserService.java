package com.example.demo.Model;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class myAppUserService implements UserDetailsService {
    @Autowired
    private MyAppUserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<MyAppUser> user = repository.findByUsername(username); // find in th DB any object wich one is the same
                                                                        // name as providetet
        throw new UnsupportedOperationException("Unimplemneted method 'loadUserByUsername'");
    }
}
