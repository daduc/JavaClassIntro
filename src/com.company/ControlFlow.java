package com.company;

public class ControlFlow {
    public static void main(String[] args) {

        String word1 = "goofy";
        String word2 = "ramoneh";
        int number1 = 26;
        int number2 = 23;

        // if - if else control flow statements

        if(word1 == word1){
            System.out.println(word2);
        }
        else if(word1 == word2){
            System.out.println("They are equal");
        }
        else {
            System.out.println(number1);
        }

        if(number1 == number1){
            number1--;
            System.out.println(number1);
        }

        if(word1.length() <= number1 ){
            System.out.println("lets play a game");
        }
        Operation doMath = new Operation();
        System.out.println(doMath.add(number1,4));
        System.out.println(doMath.message("Hmmm  "));
        System.out.println(Math.addExact(87563453,3534534));



        for(int i = 0 ; i < number1; i++){
            System.out.println(i);
        }

        while (number1 != number2){
            System.out.println("We Out");
            number2++;
        }

        do{
            System.out.println("not shit");
            number2++;
        }while(number2 != 55);


    }


}
