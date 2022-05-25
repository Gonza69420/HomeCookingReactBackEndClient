package com.homecooking.demo.data.repository;


import java.util.Optional;

import com.homecooking.demo.data.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username); //Change to mail

    Optional<User> findByMail(String mail);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}