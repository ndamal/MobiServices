package com.example.MobiServices.controllers;

import com.example.MobiServices.entities.Client;
import com.example.MobiServices.services.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by thiernosamb.
 */
@RestController
@RequestMapping("/client")
@AllArgsConstructor
public class ClientController {

    private final IClientService iClientService;

    @PostMapping("/")
    public Client addClient(@RequestBody Client client) {
        return iClientService.addClient(client);
    }
}
