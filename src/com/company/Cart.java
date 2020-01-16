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
        var total = boxes.stream().map(b -> b.getCount()).reduce((x,y) -> x+y);
        return  total.isPresent() ? total.get() : 0;
    }
}
