package de.ratzfratz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import de.ratzfratz.entities.User;
import de.ratzfratz.repositories.UserRepository;
import de.ratzfratz.security.CostumUserSec;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepo;
    @Override
    public UserDetails loadUserByUsername(String emailAdresse) throws UsernameNotFoundException {
        User user = userRepo.findByemailAdresse(emailAdresse);
        if(user == null){
            throw new UsernameNotFoundException("Inkorrekte Email und Passwort");
        }
        return new CostumUserSec(user);
    }
    
}