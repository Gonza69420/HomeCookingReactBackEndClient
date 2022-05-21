package com.homecooking.demo.data.service.serviceinteface;

import com.homecooking.demo.data.entity.Client;

import java.util.UUID;

public interface ClientService {
    void save(Client client);
    void delete(UUID id);
    Client findByEmail(String email);
    Client findById(UUID id);

}
