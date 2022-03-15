package com.example.MobiServices.repositories;

import com.example.MobiServices.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by thiernosamb.
 */
@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}
