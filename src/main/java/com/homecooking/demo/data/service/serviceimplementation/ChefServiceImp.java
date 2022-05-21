package com.homecooking.demo.data.service.serviceimplementation;

import com.homecooking.demo.data.entity.Chef;
import com.homecooking.demo.data.repository.ChefRepository;
import com.homecooking.demo.data.service.serviceinteface.ChefService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ChefServiceImp implements ChefService {
    private final ChefRepository repository;

    public ChefServiceImp(ChefRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Chef chef) {
        repository.save(chef);
    }

    @Override
    public void update(Chef chef) {
        repository.delete(chef);        //no se si funciona bien en mi cabeza si
        repository.save(chef);
    }

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Chef> getChefById(UUID id) {
        return repository.findById(id);
    }


}

