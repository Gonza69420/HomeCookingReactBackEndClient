package com.homecooking.demo.data.repository;

import com.homecooking.demo.data.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProfileRepository extends JpaRepository<Profile, UUID> {

}
