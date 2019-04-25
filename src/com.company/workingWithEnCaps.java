package com.company;

public class workingWithEnCaps {
    public static void main(String[] args) {

        // creating an object from a class
        Encaps target = new Encaps();
        //set encapsulated variable
        target.setMyName("Duc");
        //retrieved encapsulated
        System.out.println(target.getMyName());
        //set encapsulated variable
        target.setMyNumber(1998 + 1);
        //retrieved encapsulated
        System.out.println(target.getMyNumber());

    }
}
