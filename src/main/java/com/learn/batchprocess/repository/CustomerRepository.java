package com.learn.batchprocess.repository;

import com.learn.batchprocess.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
