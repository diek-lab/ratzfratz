package de.ratzfratz.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String rootView () {
        return "home";
    }

    @GetMapping("/impressum")
    public String impressum (){
        return "impressum";
    }
}