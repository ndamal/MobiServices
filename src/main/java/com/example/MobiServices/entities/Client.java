package com.example.MobiServices.entities;

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
public class Client {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long identifiant;
    private String nom;
    private String email;
    private int numCarte;
    private Date datExpcarte;
    /*@OneToMany( targetEntity=Reservation.class, mappedBy="identifiant")
    private List<Reservation> reservations = new ArrayList<>();*/
}
