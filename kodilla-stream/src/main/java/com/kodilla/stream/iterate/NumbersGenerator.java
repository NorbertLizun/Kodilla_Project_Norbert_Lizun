package com.kodilla.stream.iterate;

import java.util.stream.*;

public final class NumbersGenerator {

    public static void generateEven(int max) {
        Stream.iterate(1, n -> n + 1) //metoda iterate towrzy strumień obiektów Integer
                .limit(max) // operator filtrujący
                .filter(n -> n % 2 == 0) //true, gdy obiekt ma pozostać w strumieniu oraz wartość false, gdy obiekt powinien zostać "odrzucony"
                .forEach(System.out::println); // operacja terminalna
    }
}
