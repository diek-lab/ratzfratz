package de.ratzfratz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import de.ratzfratz.entities.Authority;
import de.ratzfratz.entities.User;
import de.ratzfratz.repositories.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public User save(final User user) {

        String encodedPW = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPW);

        Authority auth = new Authority();
        auth.setAuthority("ROLE_USER");
        auth.setUser(user);

        user.getAuthorities().add(auth);
        
        return userRepo.save(user);
    }
}