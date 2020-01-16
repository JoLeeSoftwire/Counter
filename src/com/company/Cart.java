package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cart implements Countable {
    private List<Box> boxes;

    public Cart() {
        boxes = new ArrayList<>();
    }

    public void add(Box b) {
        boxes.add(b);
    }

    public void wheelAlong() {
        System.out.println("pushing cart");
        if(Math.random() < 0.8) {
            System.out.println("wheeee");
        } else {
            System.out.println("rats! this one has a wonky wheel");
        }
    }

    @Override
    public int getCount() {
        return boxes.stream().mapToInt(b -> b.getCount()).sum();
    }
}
