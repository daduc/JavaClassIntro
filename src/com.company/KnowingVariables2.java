package com.company;

public class KnowingVariables2 {

    public static void main(String[] args) {
        // Call all of our methods from here.

        knowingMyVariables2Test();

    }

    // Write all of our methods out here.
    public static void knowingMyVariables2Test() {
        MyFavorite duc = new MyFavorite();

        duc.setMyName("Duc Dang");
        duc.setFavColor("aqua-blue");
        duc.setFavFood("steak");


        System.out.println(duc.getFavFood());
        System.out.println(duc.getFavColor());
        System.out.println(duc.getMyName());

        duc.playFavSong(" Uptown Funk - Bruno Mars");
    }
}
