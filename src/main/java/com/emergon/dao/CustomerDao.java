package com.emergon.dao;

import com.emergon.entities.Customer;
import java.util.List;

public interface CustomerDao {
    
    List<Customer> findAll();

    public void createOrUpdate(Customer c);

    public void delete(int id);

    public Customer findById(Integer id);

    public List<Customer> findCustomersByName(String searchName);
    
}
