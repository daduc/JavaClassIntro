package com.company;

import java.util.Scanner;

public class DaysOfWeek {
    /*
    using the string class and the switch statement
    i will create a Days of Week Converter
    From The Numbered Day to The Actual Day of the week
     */
    public static void main(String[] args) {
        daysOfWeekConverter();
    }
    static void daysOfWeekConverter() {
        System.out.println("Enter only one number 1-7");
        System.out.println("Ill tell you the Week Day");
        System.out.println("And some days have games hidden in them");
        int weekDay = new Scanner(System.in).nextInt();
        //utilizing switch statement to handle multiple outputs
        WordGame wg = new WordGame();
        switch(weekDay) {
            case 1: {
                String m = "Monday";
                System.out.println(m);
                wg.playGame();
            }
            break;
            case 2: {
                String tu = "Tuesday";
                System.out.println(tu);
                wg.playGame();
            }
            break;
            case 3: {
                String w = "Wednesday";
                System.out.println(w);
                wg.playGame();
            }
            break;
            case 4: {
            String th = "Thursday";
            System.out.println(th);
                wg.playGame();
        }
            break;
            case 5:{
                String fr = "Friday";
                System.out.println(fr);
                wg.playGame();
            }
            break;
            case 6: {
                String sa = "Saturday";
                System.out.println(sa);
                wg.playGame();
            }
            break;
            case 7: {
                String su = "Sunday";
                System.out.println(su);
                wg.playGame();
            }
            break;

            }
        }

    }


