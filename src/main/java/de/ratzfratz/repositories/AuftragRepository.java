package de.ratzfratz.repositories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import de.ratzfratz.entities.Auftrag;
import de.ratzfratz.entities.User;

public interface AuftragRepository extends JpaRepository<Auftrag, Integer>{
    
    @EntityGraph(value = "Auftrag.Nachricht")
    Auftrag findByuser(User user);
}