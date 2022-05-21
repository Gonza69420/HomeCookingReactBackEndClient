package com.homecooking.demo.data.repository;

import com.homecooking.demo.data.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;
import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {

    Client findByMail(@RequestParam String mail); // username = email  Check if I can return client or it has to necessarily be User

    Optional<Client> findById(Long id);

    Optional<Client> findByDni(String dni);

    Optional<Client> findByPhoneNumber(String phone);

    //Client getByActivationCode(String activationCode);
}