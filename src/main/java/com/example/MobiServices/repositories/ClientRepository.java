package com.example.MobiServices.repositories;

import com.example.MobiServices.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by thiernosamb.
 */
@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

}
