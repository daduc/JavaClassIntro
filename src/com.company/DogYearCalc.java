package com.company;



public class DogYearCalc {
    public static void main(String[] args) {
        CheckDog("Fido", 12, 20);
        CheckDog("Cito", 15, 30);
        CheckDog("Larry", 10, 40);
        CheckDog("Shremp", 16, 50);
        CheckDog("Moe", 11, 60);
        CheckDog("Flashy", 10, 70);
        CheckDog("Foxy", 8, 80);
        CheckDog("Frudo", 7, 90);
        CheckDog("Cuto", 6, 100);
        CheckDog("Midas", 5, 110);
        CheckDog("Shito", 4, 120);
        CheckDog("Weirdo", 3, 130);
        CheckDog("Hudo", 2, 150);
        CheckDog("Toto", 17, 160);
        CheckDog("Tito", 18, 200);
    }
    // But out Here.

    // Grabs a Dog to send throughout the Dog Calc Program
    public static void CheckDog(String dogName, int age, int weigth) {
        int dogIHY = DogYearCalc(age, weigth);
        System.out.println("Your dog " + dogName + " is " + dogIHY + " Years Old" +  "getBreed(weigth)");
    }

    public static int DogYearCalc(int age, int weigth) {
        switch (age) {
            case 1:
                return 15;
            case 2:
                return 24;
            case 3:
                return 28;
            case 4:
                return 32;
            case 5:
                return 36;
            default: {
            }
            if(weigth < 21){
                System.out.println("Small" + "" + weigth);
            }
            else if(weigth > 21){
                System.out.println("Medium" + "" + weigth);
            }
            else if(weigth > 50) {
                System.out.println("large" + "" + weigth);
            }
            else{

            }
            if (age > 5 && weigth < 21) {
                int rate = age - 5;
                int humanYears = 4 * rate;
                return humanYears + 36;
                    /*
                    Flat Method
                    return ((age - 5) * 4) + 36;
                    */
            } else if (age > 5 && weigth < 51) {
                return ((age - 5) * 6) + 36;
            } else if (age > 5 && weigth > 50) {
                return ((age - 5) * 9) + 36;
            }

            return 0;

        }
    }
    {
    }
}

