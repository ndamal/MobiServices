package com.example.MobiServices.services;

import com.example.MobiServices.entities.Bus;
import com.example.MobiServices.exceptions.MobiException;
import com.example.MobiServices.repositories.BusRepository;

import java.util.List;

/**
 * Created by thiernosamb.
 */
public interface IBusService {


     List<Bus> allBus();

     Bus addBus(Bus bus);

     Bus getBusById(Long id);

     void deleteBusById(Long id);
}
