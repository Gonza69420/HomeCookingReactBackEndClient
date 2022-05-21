package com.homecooking.demo.data.repository;

import com.homecooking.demo.data.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
import java.util.UUID;

public interface AdminRepository extends JpaRepository<Admin, UUID> {
    Admin findByUsername(String username); // username = email

    Optional<Admin> findById(Long id);

}

