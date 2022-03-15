package com.example.MobiServices.controllers;

/**
 * Created by thiernosamb.
 */
public class ClientController {

    public String clients(String nom){
        return String.format("Client, %s", nom);
    }
}
