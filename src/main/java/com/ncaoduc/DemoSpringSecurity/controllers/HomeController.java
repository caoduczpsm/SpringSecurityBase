package com.ncaoduc.DemoSpringSecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("home")
public class HomeController {

    @GetMapping("login")
    public String login(){return "login";}

    @GetMapping("/home")
    public ModelAndView index(){
        return new ModelAndView("index");
    }
}
