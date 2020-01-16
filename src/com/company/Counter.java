package com.company;

import java.util.ArrayList;
import java.util.List;

public class Counter<T extends Countable> {
    private List<T> items;

    public void add(T item) {
        items.add(item);
    }

    public int getCount() {
        var total = items.stream().map(i -> i.getCount()).reduce((a,b) -> a+b);
        return  total.isPresent() ? total.get() : 0;
    }
}
