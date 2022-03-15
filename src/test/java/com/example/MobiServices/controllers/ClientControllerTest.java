package com.example.MobiServices.controllers;

import com.example.MobiServices.repositories.ClientRepository;
import com.example.MobiServices.web.ClientRestController;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by thiernosamb.
 */
class ClientControllerTest {
    @Test
    void sum() {
        ClientRestController test = new ClientRestController();
        assert(test.sum(3,3) == 6);
    }



}