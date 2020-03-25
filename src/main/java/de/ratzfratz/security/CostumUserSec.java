package de.ratzfratz.security;

import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import de.ratzfratz.entities.User;

public class CostumUserSec extends User implements UserDetails {

    public CostumUserSec(int id, String name, String vorname, String emailAdresse, String adresse, String password) {
        super(id, name, vorname, emailAdresse, adresse, password);
    }

    private static final long serialVersionUID = 1L;

    @Override
    public Set<Authority> getAuthorities() {

        return this.getAuthorities();
    }

    @Override
    public String getPassword() {

        return this.getPassword();
    }

    @Override
    public String getUsername() {

        return this.getEmailAdresse();
    }

    @Override
    public boolean isAccountNonExpired() {

        return true;
    }

    @Override
    public boolean isAccountNonLocked() {

        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {

        return true;
    }

    @Override
    public boolean isEnabled() {

        return true;
    }

}