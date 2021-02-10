package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

public class BigmacTestSuite {

    @Test
    void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .Bun("with sesame")
                .Burgers(2)
                .Sauce("standard")
                .Ingredients("ogórek")
                .Ingredients("sałata")
                .Ingredients("ser")
                .build();
        System.out.println(bigmac);
    }
}
