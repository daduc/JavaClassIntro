package com.company;

    public class Operation {
        // This is the operation class
        // used to preform various
        // Operations
        // a = first number ; b = second number

        // Add +
        public int add(int a,int b){
            return a + b;
        }
        // Subtract -
        public int subtract(int a, int b){
            return a - b;
        }
        // Divide /
        public int divide(int a , int b ){
            return a/b;
        }
        // Multiply  *
        public int multiply(int a , int b ){
            return a*b;
        }

        public int multAdd(int a , int b ,int c){
            int sum = a + b ;
            System.out.println(message("Hello Multi Add"));
            return sum * c;
        }
        public String message(String a){
            String mesg = "slicing your neck into a bunch of little jello shots";
            return a + mesg ;
        }

        // Increment ++
        public int increment(int a){
            return a++;
        }
        // Decrement --
        public int decrement(int a){
            return a--;
        }
        // Modulous %
        public int modulus(int a, int b ){
            return a%b;
        }
    }


