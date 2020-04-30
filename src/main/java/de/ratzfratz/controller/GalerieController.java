package de.ratzfratz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GalerieController {

    
    @GetMapping("/galerie")
    public String galerie (){
        return "galerie";
    }
}