package com.company;

public class Apple implements Countable {
    private Colour colour;

    public Colour getColour() { return colour; }

    Apple(Colour colour) { this.colour = colour; }

    @Override
    public int getCount() { return 1; }
}
