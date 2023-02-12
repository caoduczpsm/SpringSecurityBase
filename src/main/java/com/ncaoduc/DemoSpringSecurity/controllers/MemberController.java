package com.ncaoduc.DemoSpringSecurity.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class MemberController {

    @GetMapping("index")
    public String index(){
        return "member/index";
    }

    @GetMapping("login")
    public String login(){return "login";}

}
