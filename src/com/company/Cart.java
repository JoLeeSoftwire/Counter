package com.company;

import java.util.List;

public class Cart implements Countable {
    private List<Box> boxes;

    @Override
    public int getCount() {
        var total = boxes.stream().map(b -> b.getCount()).reduce((x,y) -> x+y);
        return  total.isPresent() ? total.get() : 0;
    }
}
