package com.ncaoduc.DemoSpringSecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("member")
public class MemberController {

    @GetMapping("index")
    public String index(){
        return "member/index";
    }

    @GetMapping("login")
    public String login(){return "login";}

}
