package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class ControlFlow {
    public static void main(String[] args) {
        String word1 = "snappy";
        String word2 = "crazy";
        int number1 = 26;

        //if -if else control flow statements

        if (word1 == word1) {
            System.out.println(word2);
        } else if (word1 == word2) {
            System.out.println("They are equal");
        } else {
            System.out.println("somethif");
        }


        if (number1 == number1) {
            number1--;
            System.out.println(number1);
        }
        if (word1.length() <= number1) {
            System.out.println("Lets play a game");
            WordGame.playGame();
        }
        Operation doMath = new Operation();


}}