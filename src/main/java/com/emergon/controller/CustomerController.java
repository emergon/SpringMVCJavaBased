package com.emergon.controller;

import com.emergon.entities.Customer;
import com.emergon.service.CustomerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String createOrUpdateCustomer(Customer c){
        service.createOrUpdateCustomer(c);
        return "redirect:/customer/list";
    }
    
    @GetMapping("/delete")
    public String deleteCustomer(@RequestParam("customerId") int id){
        service.deleteCustomer(id);
        return "redirect:/customer/list";
    }
    
    @GetMapping("/update")
    public String showUpdateForm(
            @RequestParam("customerId") Integer id, Model model
    ){
        Customer c = service.findCustomerById(id);
        model.addAttribute("customer", c);
        return "formCustomer";
    }
    
    @GetMapping("/search")
    public String showCustomersByName(
            @RequestParam("searchName") String searchName, Model model){
        List<Customer> list = service.findCustomersByName(searchName);
        model.addAttribute("listOfCustomer", list);
        return "listCustomer";
    }
    
}
