package com.ncaoduc.DemoSpringSecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("guest")
public class GuestController {
    @GetMapping("login")
    public String login(){return "login";}
}
