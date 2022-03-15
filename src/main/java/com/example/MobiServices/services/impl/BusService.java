package com.example.MobiServices.services.impl;

import com.example.MobiServices.entities.Bus;
import com.example.MobiServices.exceptions.MobiException;
import com.example.MobiServices.repositories.BusRepository;
import com.example.MobiServices.services.IBusService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thiernosamb.
 */
@Service
public class BusService implements IBusService {

    private final BusRepository busRepository;

    public BusService(BusRepository busRepository) {
        this.busRepository = busRepository;
    }

    @Override
    public List<Bus> allBus() {
        return busRepository.findAll();
    }

    @Override
    public Bus addBus(Bus bus) {
        return busRepository.save(bus);
    }

    @Override
    public Bus getBusById(Long id) {
        return busRepository.findById(id).orElseThrow(() -> new MobiException("Le bus avec l'identifiant " + id + " " +
                "n'existe pas "));
    }

    @Override
    public void deleteBusById(Long id) {
        busRepository.deleteById(id);
    }
}

