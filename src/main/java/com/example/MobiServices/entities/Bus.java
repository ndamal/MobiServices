package com.example.MobiServices.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Created by thiernosamb.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numBus;
    private String trajet;
    private int nbPlaceByTrajet;
    private LocalDateTime datDebTrajet;
    private double prixTrajet;
}
