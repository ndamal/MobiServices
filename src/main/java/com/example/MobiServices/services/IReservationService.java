package com.example.MobiServices.services;

import com.example.MobiServices.entities.Reservation;

import java.util.List;

/**
 * Created by thiernosamb.
 */
public interface IReservationService {


     List<Reservation> allReservation();

     Reservation addReservation(Reservation reservation);

     Reservation getReservationById(Long id);

     void deleteReservationById(Long id);

     Boolean  payReservation(Long id);
}
