package com.ncaoduc.DemoSpringSecurity.controllers;

import com.ncaoduc.DemoSpringSecurity.models.User;
import com.ncaoduc.DemoSpringSecurity.services.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping()
public class HomeController {

    @GetMapping("login")
    public String login(){return "login";}

    @GetMapping("index")
    public String index(){
        return "index";
    }

}
