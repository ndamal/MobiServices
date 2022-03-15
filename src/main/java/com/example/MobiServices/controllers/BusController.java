package com.example.MobiServices.controllers;

import com.example.MobiServices.entities.Bus;
import com.example.MobiServices.services.IBusService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by thiernosamb.
 */
@RestController
@RequestMapping("/bus")
public class BusController {
    private final IBusService iBusService;

    public BusController(IBusService iBusService) {
        this.iBusService = iBusService;
    }

    @GetMapping("/")
    public List<Bus> allBus() {
        return  iBusService.allBus();
    }

    @PostMapping("/")
    public Bus addBus(@RequestBody Bus bus) {
        return  iBusService.addBus(bus);
    }

    @GetMapping("/{id}")
    public Bus getBus(@PathVariable(name = "id") Long id) {
        return  iBusService.getBusById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteBus(@PathVariable(name = "id") Long id) {
        iBusService.deleteBusById(id);
    }

}
