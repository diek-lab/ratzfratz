package de.ratzfratz.security;

import java.util.Set;

import org.springframework.security.core.userdetails.UserDetails;

import de.ratzfratz.entities.Authority;
import de.ratzfratz.entities.User;

public class CostumUserSec extends User implements UserDetails {

    public CostumUserSec(final User user) {
        this.setId(user.getId());
        this.setEmailAdresse(user.getEmailAdresse());
        this.setPassword(user.getPassword());
        this.setAuthorities(user.getAuthorities());
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