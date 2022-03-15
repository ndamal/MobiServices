package com.example.MobiServices.services.impl;

import com.example.MobiServices.entities.Bill;
import com.example.MobiServices.repositories.BillRepository;
import com.example.MobiServices.services.IBillService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by thiernosamb.
 */
@Service
@AllArgsConstructor
public class BillService implements IBillService {

    private final BillRepository billRepository;

    @Override
    public List<Bill> allBills() {
        return billRepository.findAll();
    }

}

