package com.example.MobiServices.services.impl;

import com.example.MobiServices.entities.Client;
import com.example.MobiServices.repositories.ClientRepository;
import com.example.MobiServices.services.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * Created by thiernosamb.
 */
@Service
@AllArgsConstructor
public class ClientService implements IClientService {

    private final ClientRepository clientRepository;

    @Override
    public Client addClient(Client client) {
        return clientRepository.save(client);
    }

}