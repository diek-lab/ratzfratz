package de.ratzfratz.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import de.ratzfratz.entities.Auftrag;
import de.ratzfratz.repositories.AuftragRepository;

@Controller
public class AuftragController {
    @Autowired
    AuftragRepository auftragRepo;

    @GetMapping("/auftrag")
    public String auftrag(ModelMap model) {
        model.put("auftrag", new Auftrag());
        return "auftrag";
    }

    @PostMapping("/auftrag")
    public String createAuftrag(Auftrag auftrag) {
        auftrag.setDatum(new Date());
        auftrag.setStatus(false);
        Auftrag savedAuftrag = auftragRepo.save(auftrag);
        System.out.println(savedAuftrag);
        return "redirect:/";
    }
}