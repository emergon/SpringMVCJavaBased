package com.emergon.dao;

import com.emergon.entities.Customer;
import java.util.List;
import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author tasos
 */
public class CustomerDaoImplTest {

    private CustomerDaoImpl cdao;
    
    public CustomerDaoImplTest() {
    }
    
    @Before
    public void setUp() {
        cdao = new CustomerDaoImpl();
    }
    
    @After
    public void tearDown() {
    }

//    @Test
//    public void testFindAll() {
//        List<Customer> list = cdao.findAll();
//        assertTrue(list.size()>0);
//
//    }
    
}
