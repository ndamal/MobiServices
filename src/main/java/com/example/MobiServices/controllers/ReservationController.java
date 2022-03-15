package com.example.MobiServices.controllers;

import com.example.MobiServices.entities.Reservation;
import com.example.MobiServices.services.IReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by thiernosamb.
 */
@RestController
@RequestMapping("/reservation")
public class ReservationController {

    private final IReservationService iReservationService;

    public ReservationController(IReservationService iReservationService) {
        this.iReservationService = iReservationService;
    }



    @GetMapping("/")
    public List<Reservation> allReservation() {
        return  iReservationService.allReservation();
    }

    @PostMapping("/")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return  iReservationService.addReservation(reservation);
    }

    @GetMapping("/{id}")
    public Reservation getReservation(@PathVariable(name = "id") Long id) {
        return  iReservationService.getReservationById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteReservation(@PathVariable(name = "id") Long id) {
        iReservationService.deleteReservationById(id);
    }

    @PutMapping("/{id}")
    public Boolean resrever(@PathVariable Long id, @RequestBody Reservation reservation) {
        return  iReservationService.payReservation(id);
    }
}
