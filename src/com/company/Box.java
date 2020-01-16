package com.company;

import java.util.ArrayList;
import java.util.List;

public class Box<T> implements Countable {
    private List<T> items;

    public Box() {
        items = new ArrayList<>();
    }

    @Override
    public int getCount() {
        return items.size();
    }

    public void add(T item) {
        items.add(item);
    }

    public void add(List<T> newItems) {
        newItems.forEach(i -> items.add(i));
    }
}