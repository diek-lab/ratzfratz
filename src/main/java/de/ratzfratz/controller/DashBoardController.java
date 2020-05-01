package de.ratzfratz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import de.ratzfratz.repositories.AuftragRepository;

@Controller
public class DashBoardController {

@Autowired
AuftragRepository auftragrepo;

    @GetMapping("/dashboard")
    public String rootView (ModelMap model){
        model.put("auftraege", auftragrepo.findAll());
        return "dashboard";
    }
}