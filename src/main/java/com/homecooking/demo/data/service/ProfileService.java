package com.homecooking.demo.data.service;

import com.homecooking.demo.data.entity.Profile;
import com.homecooking.demo.data.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ProfileService {
    private final ProfileRepository repository;

    @Autowired
    public ProfileService(ProfileRepository repository) {
        this.repository = repository;
    }

    public Optional<Profile> get(UUID id) {
        return repository.findById(id);
    }

    public Profile update(Profile entity) {
        return repository.save(entity);
    }

    public void delete(UUID id) {
        repository.deleteById(id);
    }

    public void save(Profile entity){
        repository.save(entity);
    }

}
