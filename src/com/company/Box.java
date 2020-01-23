package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Box<T> implements Countable {
    private List<T> items;

    public Box() {
        items = new ArrayList<>();
    }

    @Override
    public int getCount() {
        Map <Boolean, List<T>> countableOrNot = items.stream().collect(Collectors.partitioningBy(s -> s instanceof Countable));
        int totalCountable = countableOrNot.get(true).stream().mapToInt(i -> ((Countable) i).getCount()).sum();
        int totalNonCountable = countableOrNot.get(false).size();
        return totalCountable + totalNonCountable;
    }

    public void add(T item) {
        items.add(item);
    }

    public void add(List<T> newItems) {
        newItems.forEach(i -> items.add(i));
    }
}
