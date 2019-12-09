package com.emergon.dao;

import com.emergon.entities.Customer;
import java.util.List;

public interface CustomerDao {
    
    List<Customer> findAll();

    public void create(Customer c);

    public void delete(int id);
    
}
