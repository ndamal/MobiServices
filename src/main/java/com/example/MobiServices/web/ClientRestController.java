package com.example.MobiServices.web;

import com.example.MobiServices.entities.Client;
import com.example.MobiServices.repositories.ClientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by thiernosamb.
 */

@RestController
public class ClientRestController {


    private ClientRepository clientRepository;

    /*public ClientRestController(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }*/

    @GetMapping(path = "/clients")
    public List<Client> listClients(){
        return clientRepository.findAll();
    }
    @GetMapping(path = "/clients/{id}")
    public Client getClient(@PathVariable(name = "id") Long identifiant ){
        return clientRepository.findById(identifiant).get();
    }
    @PostMapping(path = "/clients")
    public Client save(@RequestBody Client client){
        return clientRepository.save(client);
    }
    @PutMapping(path = "/clients/{id}")
    public Client update(@PathVariable Long id,@RequestBody Client client){
        client.setIdentifiant(id);
        return clientRepository.save(client);
    }
    @DeleteMapping(path = "/clients/{id}")
    public void delete(@PathVariable Long id){
         clientRepository.deleteById(id);
    }


    public int sum(int x, int y) {
        return x+y;
    }
}
