package com.kodilla.hibernate.szkola.dao;

import com.kodilla.hibernate.dodatek.Klasa;
import com.kodilla.hibernate.dodatek.Szkola;
import com.kodilla.hibernate.dodatek.dao.SzkolaDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SzkolaDaoTestSuite {

    @Autowired
    private SzkolaDao szkolaDao;

    @Test
    void test() {

        Szkola szkolaMala = new Szkola("Mala");
        Szkola szkolaDuza = new Szkola("Duza");
        Klasa klasaA = new Klasa(32, "A");
        Klasa klasaB = new Klasa(30, "B");

        szkolaMala.getKlasy().add(klasaA);
        szkolaMala.getKlasy().add(klasaB);

        klasaA.setSzkola(szkolaMala);
        klasaB.setSzkola(szkolaMala);

        szkolaDao.save(szkolaMala);
        szkolaDao.save(szkolaDuza);
    }

}
