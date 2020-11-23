package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        Set<Country> europeanCountries = new HashSet<>();
            europeanCountries.add(new Country("Poland", new BigDecimal("37672367")));
            europeanCountries.add(new Country("Italy", new BigDecimal("50672367")));
            europeanCountries.add(new Country("Germany", new BigDecimal("12672367")));

        Continent europe = new Continent(europeanCountries, "Europa");

        Set<Country> asianCountries = new HashSet<>();
            asianCountries.add(new Country("China", new BigDecimal("9596961")));
            asianCountries.add(new Country("Mongolia", new BigDecimal("1564110")));

        Continent asia = new Continent(asianCountries, "Azja");

        Set<Country> africanCountries = new HashSet<>();
            africanCountries.add(new Country("Nigeria", new BigDecimal("206139589")));
            africanCountries.add(new Country("Ethiopia", new BigDecimal("114963588")));
            africanCountries.add(new Country("Egypt", new BigDecimal("102334404")));

        Continent africa = new Continent(africanCountries, "Afryka");


        Set<Continent> continents = new HashSet<>();
            continents.add(europe);
            continents.add(asia);
            continents.add(africa);

        World world = new World(continents);

        //When
        BigDecimal totalQuantityOfPeople = world.getPeopleQuantity();



        //Then
        BigDecimal expectedSand = new BigDecimal("535615753");
        assertEquals(expectedSand, totalQuantityOfPeople);
    }
}
