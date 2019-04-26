package com.EncapsHomeWork;

public class Class2 {
    private String myEthnicity;
    private int myAge;
    private String myFavFood;
    private boolean male;
    private int myHeight;

    public String getMyEthicity() {
        return myEthnicity;
    }

    public void setMyEthicity(String myEthnicity) {
        this.myEthnicity = myEthnicity;
    }

    public int getMyAge() {
        return myAge;
    }

    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public String getMyfavFood() {
        return myFavFood;
    }

    public void setMyfavFood(String myfavFood) {
        this.myFavFood = myfavFood;
    }

    public boolean Male() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public int getMyHeight() {
        return myHeight;
    }

    public void setMyHeigt(int myheight) {
        this.myHeight = myheight;
    }

    public static void main(String[] args) {
        Class2 ethnicity = new Class2();
        ethnicity.setMyEthicity("asian");
        Class2 age = new Class2();
        age.setMyAge(48);
        Class2 favFood = new Class2();
        favFood.setMyfavFood("steak");
        Class2 male = new Class2();
        male.Male();
        Class2  Height = new Class2();
        Height.setMyHeigt(66);
        System.out.println(ethnicity.getMyEthicity());
        System.out.println(age.getMyAge());
        System.out.println(favFood.getMyfavFood());
        System.out.println(male.Male());
        System.out.println(Height.getMyHeight());










    }
}
