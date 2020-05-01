package de.ratzfratz.controller;

import java.io.IOException;
import java.util.Date;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/auftrag/{auftragsnummer}")
    public String getauftrag(@PathVariable Integer auftragsnummer, ModelMap model, HttpServletResponse response)
            throws IOException {
        Optional<Auftrag> auftragOpt = auftragRepo.findById(auftragsnummer);
        if (auftragOpt.isPresent()) {
            Auftrag auftrag = auftragOpt.get();
            model.put("auftrag", auftrag);
        } else {
            response.sendError(HttpStatus.NOT_FOUND.value(), "Product with id " + auftragsnummer + " was not found");
            return "auftrag";
        }

        return "auftrag";
    }

    @PostMapping("/auftrag/{auftragsnummer}")
    public String updateProduct(@PathVariable Integer auftragsnummer, Auftrag auftrag) {

        auftrag.setAuftragsNummer(auftragsnummer);
        auftrag.setDatum(auftragRepo.findById(auftragsnummer).get().getDatum());
        auftrag = auftragRepo.save(auftrag);

        return "redirect:/dashboard";
    }

    @GetMapping("/delete/{auftragsnummer}")
    public String deleteProduct(@PathVariable Integer auftragsnummer, Auftrag auftrag) {

        auftrag.setAuftragsNummer(auftragsnummer);
        auftragRepo.delete(auftrag);

        return "redirect:/dashboard";
    }
}