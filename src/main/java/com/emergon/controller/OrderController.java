package com.emergon.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/create")
    public String showOrderForm() {
        return "formOrder";
    }

    //@PostMapping// "order/create"
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String showOrderDetails(Model m,
            @RequestParam("bread") String bread,
            @RequestParam("ingredient") String[] ingredient,
            @RequestParam("payment") String payment,
            @RequestParam("name") String name,
            @RequestParam("age") int age
    ) {
        m.addAttribute("bread", bread);
        m.addAttribute("ingredient", ingredient);
        m.addAttribute("payment", payment);
        m.addAttribute("name", name);
        m.addAttribute("age", age);
        return "orderDetails";
    }
}
