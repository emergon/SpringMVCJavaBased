package com.emergon.service;

import com.emergon.entities.Customer;
import java.util.List;

public interface CustomerService {
    
    List<Customer> getAllCustomers();

    public void createOrUpdateCustomer(Customer c);

    public void deleteCustomer(int id);

    public Customer findCustomerById(Integer id);

    public List<Customer> findCustomersByName(String searchName);
}
