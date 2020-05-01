package de.ratzfratz.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@NamedEntityGraph(name = "User.Auth", attributeNodes =  @NamedAttributeNode("authorities"))
@Table(name ="users")
public class User{
    private int id;
    private String emailAdresse;
    private String password;
    private Set<Authority> authorities = new HashSet<>();

    public String getEmailAdresse() {
        return emailAdresse;
    }

    public void setEmailAdresse(final String emailAdresse) {
        this.emailAdresse = emailAdresse;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "user")
    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(final Set<Authority> authorities) {
        this.authorities = authorities;
    }
    public User() { }

	@Override
	public String toString() {
		return "User [authorities=" + authorities + ", emailAdresse=" + emailAdresse + ", id=" + id + ", password="
				+ password + "]";
	}
}