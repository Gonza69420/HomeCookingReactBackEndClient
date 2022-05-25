package com.homecooking.demo.data.repository;
import java.util.Optional;

import com.homecooking.demo.data.entity.ERole;
import com.homecooking.demo.data.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}