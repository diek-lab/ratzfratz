package de.ratzfratz.repositories;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import de.ratzfratz.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@EntityGraph(value = "User.Auth")
	User findByemailAdresse(String emailAdresse);

}