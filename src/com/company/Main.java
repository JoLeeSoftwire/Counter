package com.company;

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
        Cart cart1 = new Cart();
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
        cart1.add(box1);
        cart1.add(box2);
        cart1.add(box3);
        System.out.println("There are "+cart1.getCount()+" things in cart 1 (should be 8)");
    }
}
