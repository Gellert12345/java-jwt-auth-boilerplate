package com.example.demo.Model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

// Repositroy to interact with the database!! komunikávios réteg
public interface MyAppUserRepository extends JpaRepository<MyAppUser, Long> {
    Optional<MyAppUser> findByUsername(String username); // Optional => return a data or it tells or its empty and dont
                                                         // thow errors
}
