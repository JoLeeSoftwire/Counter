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

    @Override
    public int getCount() {
        return boxes.stream().mapToInt(b -> b.getCount()).sum();
    }
}
