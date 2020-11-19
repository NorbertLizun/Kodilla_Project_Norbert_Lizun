package com.kodilla.testing.collection;

import java.util.ArrayList;
import java.util.List;

public class OddNumbersExterminator {
    private List<Integer> evenList;

    public OddNumbersExterminator(List<Integer> evenList) {
        this.evenList = evenList;
    }

    public List<Integer> getEvenList() {
        return evenList;
    }

    public List<Integer> exterminate(List<Integer> numbers) {
        int temp;
        for (int i = 0; i < numbers.size(); i++) {
            temp = numbers.get(i);
            if(temp % 2 == 0) {
                evenList.add(temp);
            }
        }
        return evenList;
    }
}
