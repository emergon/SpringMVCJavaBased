package com.emergon.controller;

import com.emergon.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {

    @Autowired
    LoginService loginService;
    
    @RequestMapping
    public String home() {
        return "home";
    }

    @RequestMapping("/user")
    public String showUser(@RequestParam("name") String name, Model model) {
        model.addAttribute("name", name);
        return "user";
    }

    @RequestMapping("/userdetails/{name}/{age}")
    public ModelAndView showUserDetails(
            @PathVariable("name") String name,
            @PathVariable("age") int age,
            ModelAndView mv) {
        //ModelAndView mv = new ModelAndView();
        mv.addObject("name", name);
        mv.addObject("age", age);
        mv.setViewName("userDetails");
        return mv;
    }

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model,
            @RequestParam("username") String username,
            @RequestParam("password") String password) {
        boolean validatedUser = loginService.validateUser(username, password);
        if(!validatedUser){
            model.addAttribute("message", "Invalid username/password");
            return "login";
        }
        return "home";
    }

}
