package com.example.MobiServices.services.impl;

import com.example.MobiServices.entities.Bus;
import com.example.MobiServices.entities.Client;
import com.example.MobiServices.exceptions.MobiException;
import com.example.MobiServices.repositories.BusRepository;
import com.example.MobiServices.repositories.ClientRepository;
import com.example.MobiServices.services.IBusService;
import com.example.MobiServices.services.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

