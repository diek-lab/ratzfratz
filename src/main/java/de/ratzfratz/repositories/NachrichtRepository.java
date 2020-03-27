package de.ratzfratz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import de.ratzfratz.entities.Nachricht;

public interface NachrichtRepository extends JpaRepository<Nachricht, Integer>{
    
}