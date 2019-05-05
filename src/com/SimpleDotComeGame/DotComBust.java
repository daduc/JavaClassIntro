package com.SimpleDotComeGame;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int NumberOfGuesses = 0;
    private void SetUpGame(){
        // first make some dot coms and give them locations
        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        two.setName("eToys.com");
        DotCom three = new DotCom();
        three.setName("Go2.com");
        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);
        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");
        for(DotCom dotComToSet : dotComList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        } // close for loop

        } // close setUpGame method
    private void StartPlaying(){
        while(!dotComList.isEmpty()){
            String userGuess = helper.getUserInput("Enter a Guess");
            CheckUserGuess(userGuess);
        } //close while
        finishGame();
    } // close startPlaying method
    private void CheckUserGuess(String userGuess){
        NumberOfGuesses++;
        String result = "miss";
        for(DotCom dotComToTest : dotComList){
            result = dotComToTest.checkYourself(userGuess);
            if(result.equals("hit")){
                break;
            }
            if(result.equals("kill")){
                dotComList.remove(dotComToTest);
                break;
            }
        } //close for
        System.out.println(result);
    }  // close method
    private void finishGame(){
        System.out.println("All dot Coms are dead! Your stock is now worthless.");
        if(NumberOfGuesses <= 18){

        System.out.println("It only took you" + NumberOfGuesses+ "guesses.");
        System.out.println("You out before your options sank. ");
    }   else {
        System.out.println("Took you long enough." +NumberOfGuesses + "guesses.");
        System.out.println("Fish are dancing with your options.");
    }
}    // close method

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.SetUpGame();
        game.StartPlaying();
    } // close method
 }
