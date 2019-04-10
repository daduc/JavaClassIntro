package com.company;

public class AccessModifiers {


    public static void main(String[] args) {
        // Calling All Method
        saySomethingNice();
        secretWord();
        DefaultExample obj = new DefaultExample();
        obj.display();

    }

     static void saySomethingNice(){
        String duc = "hello mike";
        System.out.println(duc);

    }
     static void secretWord(){
        String arcade = "Hello Game";
        String a = arcade.substring(4,8);
        String b = arcade.substring(7);
        String c = b + arcade + a;
        System.out.println(c);
    }
}
