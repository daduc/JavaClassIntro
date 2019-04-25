package com.company;

public class Day12Review {

    // Access modifiers
    protected String name = "duc_dang";
    public char letter = 'd';
    private int bank$ = 0;
    long division = 789 * 3;

    //object
    public static void main(String[] args) {
        MyHouse house1 = new MyHouse();
        house1.walls = 3;
        house1.foundation = "concrete";
        house1.openDoors();
        house1.deadBodies = 34;
        house1.level = 8;
        System.out.println(house1.walls);
        System.out.println(house1.level);
        System.out.println(house1.deadBodies);
        System.out.println(house1.foundation);
        house1.closeDoor();
        house1.openDoors();



    }

    //method
}

