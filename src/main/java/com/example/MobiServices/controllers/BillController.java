package com.example.MobiServices.controllers;

import com.example.MobiServices.entities.Bill;
import com.example.MobiServices.services.IBillService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by thiernosamb.
 */
@RestController
@RequestMapping("/bill")
@AllArgsConstructor
public class BillController {

    private final IBillService iBillService;

    @GetMapping("/")
    public List<Bill> allBills() {

        return iBillService.allBills().stream()
                .sorted(Comparator.comparingLong(Bill::getIdBill))
                .collect(Collectors.toList());
    }

}
