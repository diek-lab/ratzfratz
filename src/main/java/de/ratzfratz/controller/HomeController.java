package de.ratzfratz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String rootView (){
        return "home";
    }

    @PostMapping("/login")
    public String login(){
        return "/login";
    }
}