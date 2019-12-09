package com.emergon.controller;

import com.emergon.entities.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {
    
    @RequestMapping
    public String home(){
        return "home";
    }
    @RequestMapping("/user")
    public String showUser(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "user";
    }
    
    @RequestMapping("/userdetails/{name}/{age}")
    public ModelAndView showUserDetails(
            @PathVariable("name") String name,
            @PathVariable("age") int age,
            ModelAndView mv){
        //ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("userDetails");
        return mv;
    }
    
    @RequestMapping(value = "/customer/create", method = RequestMethod.GET)
    public String showForm(@ModelAttribute("customer") Customer c){
        return "formCustomer";
    }
    
    //@RequestMapping(value = "/customer/create", method = RequestMethod.POST)
    @PostMapping("/customer/create")
    public String createCustomer(Customer c,
            //@RequestParam("name") String onoma, 
            //@RequestParam("age") int age,
            Model m){
        //m.addAttribute("name", onoma);
        //m.addAttribute("age", age);
        m.addAttribute("customer", c);
        return "customerDetails";
    }
    
}
