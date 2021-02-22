package com.kodilla.hibernate.dodatek;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "KLASA")
public class Klasa {

    private int id;
    private int iloscUczniow;
    private String nazwaKlasy;
    private Szkola szkola;

    public Klasa() {
    }

    public Klasa(int iloscUczniow, String nazwaKlasy) {
        this.iloscUczniow = iloscUczniow;
        this.nazwaKlasy = nazwaKlasy;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "KLASA_ID", unique = true)
    public int getId() {
        return id;
    }

    @Column(name = "ILOSC_UCZNIOW")
    public int getIloscUczniow() {
        return iloscUczniow;
    }

    @Column(name = "NAZWA_KLASY")
    public String getNazwaKlasy() {
        return nazwaKlasy;
    }

    @ManyToOne
    @JoinColumn(name = "SZKOLA_ID")
    public Szkola getSzkola() {
        return szkola;
    }

    public void setSzkola(Szkola szkola) {
        this.szkola = szkola;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIloscUczniow(int iloscUczniow) {
        this.iloscUczniow = iloscUczniow;
    }

    public void setNazwaKlasy(String nazwaKlasy) {
        this.nazwaKlasy = nazwaKlasy;
    }
}
