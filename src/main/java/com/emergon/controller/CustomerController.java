package com.emergon.controller;

import com.emergon.entities.Customer;
import com.emergon.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    
    @Autowired
    CustomerService service;
    
    @GetMapping("/list")
    public String showCustomers(Model m){
        
        List<Customer> list = service.getAllCustomers();
        m.addAttribute("listOfCustomer", list);
        return "listCustomer";
    }
    
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(@ModelAttribute("customer") Customer c){
        return "formCustomer";
    }
    
    //@RequestMapping(value = "/customer/create", method = RequestMethod.POST)
    @PostMapping("/create")
    public String createCustomer(Customer c, Model m){
        service.createCustomer(c);
        return "redirect:/customer/list";
    }
    
}
