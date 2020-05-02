package de.ratzfratz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String rootView (@CookieValue(value = "auftrag", defaultValue = "false") String auftrag, ModelMap map) {
        map.put("auftrag", auftrag);
        return "home";
    }

    @GetMapping("/impressum")
    public String impressum (){
        return "impressum";
    }
}