package com.homecooking.demo.data.repository;

import com.homecooking.demo.data.entity.Chef;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ChefRepository extends JpaRepository<Chef, UUID> {
    Chef findByMail(String mail); // username = email
    //Chef getByActivationCode(String activationCode);
    Optional<Chef> findById(UUID id);

    @Query(value = "SELECT * FROM chef WHERE is_verified = 0 ", nativeQuery = true)
    List<Chef> findByVerifiedFalse();

    @Query(value = "SELECT * FROM chef WHERE is_verified = 1 ", nativeQuery = true)
    List<Chef> findByVerifiedTrue();

    @Query(value = "SELECT * FROM chef  WHERE id = ?1 SET is_verified = 1", nativeQuery = true)
    void verifyChef(UUID id);
}

