package com.example.MobiServices.entities;

import com.example.MobiServices.enums.TypePaiement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Created by thiernosamb.
 */
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Bill {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBill;
    private Long idReservation;
    private TypePaiement typePaiement;
}
