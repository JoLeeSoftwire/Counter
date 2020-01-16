package com.company;


public class DayOfChristmas implements Countable {
    private int dayNumber;

    public DayOfChristmas(int d) {
        dayNumber = d;
    }

    @Override
    public int getCount() {
        return dayNumber;
    }
}
