package com.emergon.controller;

import com.emergon.entities.User;
import com.emergon.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
@SessionAttributes("user")
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

    @ModelAttribute("user")//Before each request this method is been activated
    public User user(){
        User user = new User();
        System.out.println("user ========="+user);
        return user;
    }
    
    @GetMapping("/login")
    public String showLoginForm(
    //        @ModelAttribute("user") User user, Model m
    ) {
        //m.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model, @ModelAttribute("user") User user) {
        User validatedUser = loginService.validateUser(user);
        if(validatedUser == null){
            model.addAttribute("message", "Invalid username/password");
            return "login";
        }else{
            return "redirect:/";
        }
    }
    
    @GetMapping("/logout")
    public String logout(SessionStatus status){
        status.setComplete();
        return "redirect:/login";
    }

}
