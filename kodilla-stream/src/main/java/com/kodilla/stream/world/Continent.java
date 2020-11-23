package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    public final Set<Country> countries;

    public Continent(final Set<Country> countries,final String continentName) {
        this.countries = countries;
    }

    public Set<Country> getCountries() {
        return countries;
    }

}
