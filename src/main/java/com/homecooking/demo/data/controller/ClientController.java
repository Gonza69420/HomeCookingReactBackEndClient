package com.homecooking.demo.data.controller;

import com.homecooking.demo.data.entity.Client;
import com.homecooking.demo.data.service.serviceinteface.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping("/add")
    public String add(@RequestBody Client client){
        clientService.save(client);
        return "New client is added";
    }

    @PostMapping("/delete")
    public String delete(@RequestBody UUID id){
        clientService.delete(id);
        return "Client is deleted";
    }

    @PostMapping("/findbyid")
    public Client findById(@RequestBody UUID id){
        return clientService.findById(id);
    }

    @PostMapping("/findbyemail")
    public Client findByEmail(@RequestBody String email){
        return clientService.findByEmail(email);
    }
}
