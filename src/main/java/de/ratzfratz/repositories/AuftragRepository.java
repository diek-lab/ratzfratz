package de.ratzfratz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.ratzfratz.entities.Auftrag;

public interface AuftragRepository extends JpaRepository<Auftrag, Integer>{
    
}