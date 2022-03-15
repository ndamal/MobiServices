package com.example.MobiServices.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by thiernosamb.
 */
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Reservation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private Date dateTrajet;
    private Long identifiant;
    private Long numBus;
    private double prix;
    private Boolean ispayed;
}
