package com.example.MobiServices.repositories;

import com.example.MobiServices.entities.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by thiernosamb.
 */
@Repository
public interface BillRepository extends JpaRepository<Bill, Long> {

}
