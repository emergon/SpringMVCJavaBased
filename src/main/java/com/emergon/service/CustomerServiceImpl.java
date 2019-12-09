package com.emergon.service;

import com.emergon.dao.CustomerDao;
import com.emergon.entities.Customer;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    CustomerDao cdao;
    
    @Override
    public List<Customer> getAllCustomers() {
        return cdao.findAll();
    }

    @Override
    public void createCustomer(Customer c) {
        cdao.create(c);
    }

    @Override
    public void deleteCustomer(int id) {
        cdao.delete(id);
    }
    
}
