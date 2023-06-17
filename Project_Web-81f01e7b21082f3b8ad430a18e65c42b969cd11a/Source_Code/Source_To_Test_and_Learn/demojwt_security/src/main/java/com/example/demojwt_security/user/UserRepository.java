package com.example.demojwt_security.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.testng.annotations.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {

    @Optional
    <User> findByEmail(String email);



}
