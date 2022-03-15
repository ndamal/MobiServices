package com.example.MobiServices.repositories;

import com.example.MobiServices.entities.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by thiernosamb.
 */
@Repository
public interface BusRepository extends JpaRepository<Bus, Long> {
    
}
