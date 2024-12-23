package com.learn.batchprocess.config;

import com.learn.batchprocess.entity.Customer;
import org.springframework.batch.item.ItemProcessor;

public class CustomerProcessor implements ItemProcessor<Customer, Customer> {
    @Override
    public Customer process(Customer customer){
        if ("United States".equals(customer.getCountry())) {
            return customer;
        } else {
            return null;
        }
        //return customer;
    }
}
