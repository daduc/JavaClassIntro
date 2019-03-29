package com.company;

import java.util.Scanner;

public class StringExamples {
    //This will be a helpful too for learning strings

    /*
    add any other helpful information here
    word.charAt(enter a number here); return char at number
    word.concat("enter a word"); add a word to the end
    word.equals("enter a word"); compares two strings
    word.toUpperCase(); makes a word all CAPS
    word.toLowerCase(); makes the word LOWERcase

     */
    // sout ENTER creates system.out.println();
    // psvm ENTER creates public static void main(string[] args {
    public static void main(String[] args) {
        System.out.println("Enter a 5 letter Word Please or Die");
        String example = new Scanner(System.in).next();
        System.out.println(example.charAt(example.length()/2));
        System.out.println(example.equals(example));
        System.out.println(example.concat(example));
        System.out.println(example.toUpperCase());
        System.out.println(example.toLowerCase());
    }

}
