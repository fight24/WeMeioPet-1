package com.web.WeMeioPet.repository;

import com.web.WeMeioPet.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
