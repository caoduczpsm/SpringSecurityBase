package com.ncaoduc.DemoSpringSecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("admin")
public class AdminController {

    @GetMapping("index")
    public ModelAndView index(){
        return new ModelAndView("admin/index");
    }

}
