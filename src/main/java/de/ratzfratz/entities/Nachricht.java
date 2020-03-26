package de.ratzfratz.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Nachricht{

    private Integer Id;
    private String text;
    private User user;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return Id;
    }

    public void setId(final Integer id) {
        Id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    @ManyToOne
    public User getUser() {
        return user;
    }

    public void setUser(final User user) {
        this.user = user;
    }

    public Nachricht(final Integer id, final String text, final User user) {
        Id = id;
        this.text = text;
        this.user = user;
    }

    public Nachricht() { }

    
}