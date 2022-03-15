package com.example.MobiServices.services.impl;

import com.example.MobiServices.entities.Bus;
import com.example.MobiServices.entities.Client;
import com.example.MobiServices.entities.Reservation;
import com.example.MobiServices.exceptions.MobiException;
import com.example.MobiServices.repositories.BusRepository;
import com.example.MobiServices.repositories.ClientRepository;
import com.example.MobiServices.repositories.ReservationRepository;
import com.example.MobiServices.services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thiernosamb.
 */
@Service
@AllArgsConstructor
public class ReservationService implements IReservationService {

    private final ReservationRepository reservationRepository;
    private final ClientRepository clientRepository;
    private final BusRepository busRepository;




    @Override
    public List<Reservation> allReservation() {
        return  reservationRepository.findAll();
    }

    @Override
    public Reservation addReservation(Reservation reservation) {
        Bus b = busRepository.findBusByNumBus(reservation.getNumBus());
        String moyen;

        double prixPromo = b.getPrixTrajet()<100 ? b.getPrixTrajet() : b.getPrixTrajet() * 5 / 100;
        reservation.setPrix(b.getPrixTrajet() - prixPromo);
        reservation.setIsPayed(false);
        Client client = clientRepository.findById(reservation.getIdentifiant()).orElseThrow(() -> new MobiException("" +
                "Le Client avec l'identifiant de reservation "+reservation.getIdentifiant()+" " +
                "n'existe pas "));
        moyen = reservation.getTypePaiement().equals("PAYPAL")  ? client.getEmail()   : +client.getNumCarte()+" "+client.getDatExpcarte();

        //reservation.setTypePaiement(typePaiement);
        reservation.setMoyenPaiement(moyen);


        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation getReservationById(Long id) {
        return reservationRepository.findById(id).orElseThrow(()->new MobiException("Le reservation avec l'identifiant "+id+" " +
                "n'existe pas "));
    }

    @Override
    public void deleteReservationById(Long id) {
        reservationRepository.deleteById(id);
    }

    @Override
    public Boolean payReservation(Long id) {


        Boolean ret=false;
        Reservation r = reservationRepository.findById(id).orElseThrow(() -> new MobiException("Le reservation avec " +
                "l'identifiant "+id+" " +
                "n'existe pas "));


        if(r!=null) {
            r.setIsPayed(true);
            reservationRepository.save(r);
            ret = true;
        }

        return ret;
    }
}

