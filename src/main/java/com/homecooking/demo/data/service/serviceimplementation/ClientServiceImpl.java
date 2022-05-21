package com.homecooking.demo.data.service.serviceimplementation;

import com.homecooking.demo.data.entity.Client;
import com.homecooking.demo.data.repository.ClientRepository;
import com.homecooking.demo.data.service.serviceinteface.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class ClientServiceImpl implements ClientService {
    private final ClientRepository repository;

    public ClientServiceImpl(ClientRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(Client client){repository.save(client);}

    @Override
    public void delete(UUID id) {
        repository.deleteById(id);
    }

    @Override
    public Client findByEmail(String email) {
        return repository.findByMail(email);
    }

    @Override
    public Client findById(UUID id) {
        return repository.findById(id).get();
    }


}

