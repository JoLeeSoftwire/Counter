package com.company;

import java.awt.desktop.SystemEventListener;

public class Main {

    public static void main(String[] args) {
        Counter<Apple> appleCounter = new Counter<>();
        Apple a1 = new Apple();
        Apple a2 = new Apple();
        Apple a3 = new Apple();
        Apple a4 = new Apple();
        appleCounter.add(a1);
        appleCounter.add(a2);
        appleCounter.add(a3);
        appleCounter.add(a4);
        System.out.println("We have "+appleCounter.getCount()+" apples (should be 4)");

        Counter<Cart> cartCounter = new Counter<>();
        Cart cart = new Cart();
        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();
        box1.add(2);
        box1.add(4);
        box1.add(12);
        box2.add(new Apple());
        box2.add("Turtle Dove");
        box2.add(483);
        box3.add(false);
        box3.add("Packet of seeds");
        cart.add(box1);
        cart.add(box2);
        cart.add(box3);
        System.out.println("There are "+cart.getCount()+" things in our cart (should be 8)");
        cart.wheelAlong();

        Counter<DayOfChristmas> gifts = new Counter<>();
        DayOfChristmas firstDay = new DayOfChristmas(1);
        DayOfChristmas eighthDay = new DayOfChristmas(8);
        DayOfChristmas ninthDay = new DayOfChristmas(9);
        gifts.add(firstDay);
        gifts.add(eighthDay);
        gifts.add(ninthDay);
        System.out.println("This year my true love gave a total of "+gifts.getCount()+" gifts :O");

        Counter<Countable> vagueCounter = new Counter();
        vagueCounter.add(new Apple());
        vagueCounter.add(new DayOfChristmas(2));
        vagueCounter.add(new DayOfChristmas(12));
        vagueCounter.add(new Box());
        Box boxB = new Box();
        boxB.add(new Apple());
        boxB.add(2);
        boxB.add(new DayOfChristmas(11));
        vagueCounter.add(cart);
        vagueCounter.add(boxB);
        System.out.println("vague counter can see "+vagueCounter.getCount()+" things");

    }
}
