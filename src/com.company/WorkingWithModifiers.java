package com.company;

public class WorkingWithModifiers {
    public static void main(String[] args) {
        // Lets we see if we can call private methods
        AccessModifiers am = new AccessModifiers();
        am.saySomethingNice();
        am.secretWord();
    }
}