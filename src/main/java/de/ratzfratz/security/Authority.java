package de.ratzfratz.security;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.security.core.GrantedAuthority;

import de.ratzfratz.entities.User;

@Entity
public class Authority implements GrantedAuthority{

    private static final long serialVersionUID = 1L;
    private Integer id;
    private String authority;
    private User user;
    
    @Override
	public String getAuthority() {
		return this.authority;
	}

    public void setAuthority(final String authority) {
        this.authority = authority;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }

    public Authority(final Integer id, final String authority, final User user) {
        this.id = id;
        this.authority = authority;
        this.user = user;
    }
}
