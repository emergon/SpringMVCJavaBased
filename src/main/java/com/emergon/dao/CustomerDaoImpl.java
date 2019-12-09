package com.emergon.dao;

import com.emergon.entities.Customer;
import java.util.List;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDaoImpl implements CustomerDao{

    @Autowired
    private SessionFactory sessionFactory;
    
    private Session getSession(){
        return sessionFactory.getCurrentSession();
    }
    
    @Override
    public List<Customer> findAll(){
         Query q = getSession().createQuery("SELECT c FROM Customer c");
         List<Customer> list = q.getResultList();
         return list;
    }

    @Override
    public void create(Customer c) {
        getSession().save(c);
    }

    @Override
    public void delete(int id) {
        Customer c = getSession().find(Customer.class, id);
        getSession().delete(c);
    }
    
    
}
