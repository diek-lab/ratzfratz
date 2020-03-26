package de.ratzfratz.security;

import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import de.ratzfratz.entities.Authority;
import de.ratzfratz.entities.User;

public class CostumUserSec extends User implements UserDetails {

    public CostumUserSec(int id, String name, String vorname, String emailAdresse, String adresse, String password) {
        super(id, name, vorname, emailAdresse, adresse, password);
    }

    public CostumUserSec(User user) {
        this.setId(user.getId());
        this.setAdresse(user.getAdresse());
        this.setEmailAdresse(user.getEmailAdresse());
        this.setName(user.getName());
        this.setPassword(user.getPassword());
        this.setVorname(user.getVorname());
        this.setAuftrag(user.getAuftrag());
        this.setAuthorities(user.getAuthorities());
        this.setNachricht(user.getNachricht());
    }
    
    public CostumUserSec() { }

	private static final long serialVersionUID = 1L;

    @Override
    public Set<Authority> getAuthorities() {

        return super.getAuthorities();
    }

    @Override
    public String getPassword() {

        return super.getPassword();
    }

    @Override
    public String getUsername() {

        return super.getEmailAdresse();
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