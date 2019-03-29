package com.company;

import java.util.Scanner;

public class WordGame {
    public static void main(String[] args) {
        System.out.println("---------loading");
        System.out.println("------------------loading");
        System.out.println("--------------------------loading");
        System.out.println("------------------------------------loading");
        System.out.println("--------------------------------------------loading");
        System.out.println("-----------------------------------------------------loading");
        System.out.println("done");
        System.out.println("");
        System.out.println("");
        System.out.println("Welcome to The Deadliest Word Game Ever");
        System.out.println("Utilizing Java We Made A Game That Kills");
        System.out.println("Enter Secret Word _ Don't let anyone know");
        String secretWord = new Scanner(System.in).next();
        System.out.println("The Secret just lost it letters" +
                "The Word needs help getting all of its contents and vowels");
        System.out.println("Will you help ? enter yes or no");
        String willHelp = new Scanner(System.in).next();
        if (willHelp.toLowerCase() == "yes") {
            int numberofGuesses = secretWord.length();
            System.out.println("you have : " + numberofGuesses + "guesses");

        else if (willHelp.toLowerCase() == "no") {
                System.out.println("Really ? - You Died");
            }
        }

    }








