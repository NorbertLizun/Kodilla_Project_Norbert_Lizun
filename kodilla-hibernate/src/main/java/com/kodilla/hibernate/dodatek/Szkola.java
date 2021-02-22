package com.kodilla.hibernate.dodatek;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "SZKOLA")
public class Szkola {

    private int id;
    private String name;
    private List<Klasa> klasy = new ArrayList<>();


    public Szkola() {
    }

    public Szkola(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "SZKOLA_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "NAZWA")
    public String getName() {
        return name;
    }

    @OneToMany(
            targetEntity = Klasa.class,
            mappedBy = "szkola",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Klasa> getKlasy() {
        return klasy;
    }

    public void setKlasy(List<Klasa> klasy) {
        this.klasy = klasy;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
