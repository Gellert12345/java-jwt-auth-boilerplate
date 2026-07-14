package com.example.demo.Model;

import org.springframework.data.jpa.repository.JpaRepository;

// Repositroy to interact with the database!! komunikávios réteg
public interface MyAppUserRepository extends JpaRepository<MyAppUser, Long> {

}
