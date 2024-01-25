package com.elacharnawfal.customerfrontthymeleafapp.repository;


import com.elacharnawfal.customerfrontthymeleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
