package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Counter<T extends Countable> {
    private List<T> items;
    private Predicate<T> doCount;

    public Counter() {
        items = new ArrayList<>();
        doCount = (T x) -> true;
    }

    public Counter(Predicate<T> doCount) {
        items = new ArrayList<>();
        this.doCount = doCount;
    }

    public void add(T item) {
        items.add(item);
    }

    public int getCount() {
        return items.stream().filter(doCount).mapToInt(Countable::getCount).sum();
    }
}
