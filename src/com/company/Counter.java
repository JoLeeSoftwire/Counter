package com.company;

import java.util.ArrayList;
import java.util.List;

public class Counter<T> {
    private List<T> items;

    public Counter() {
        items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public int getCount() {
        return items.size();
    }
}
