package com.web.WeMeioPet.repository;

import com.web.WeMeioPet.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product,Integer> {
}
