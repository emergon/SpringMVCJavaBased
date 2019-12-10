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
    public void createOrUpdateCustomer(Customer c) {
        cdao.createOrUpdate(c);
    }

    @Override
    public void deleteCustomer(int id) {
        cdao.delete(id);
    }

    @Override
    public Customer findCustomerById(Integer id) {
        return cdao.findById(id);
    }

    @Override
    public List<Customer> findCustomersByName(String searchName) {
        List<Customer> list = cdao.findCustomersByName(searchName);
        return list;
    }
    
}
