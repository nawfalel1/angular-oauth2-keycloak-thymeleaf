package com.elacharnawfal.inventoryservice.repository;

import com.elacharnawfal.inventoryservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,String> {
}
