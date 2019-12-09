package com.emergon.service;

import com.emergon.entities.Customer;
import java.util.List;

public interface CustomerService {
    
    List<Customer> getAllCustomers();

    public void createCustomer(Customer c);

    public void deleteCustomer(int id);
}
