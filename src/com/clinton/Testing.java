package com.clinton;

public class Testing {
    public static void main(String[] args) {
        // System.out.println is the same as echo in php
        System.out.println("Data Types");

        //for one to create a variable one needs to indicate the data type
        int x = 10;

        double y = 7.65;
        //a double is a number that has decimal points

        String names = "John Mark";
        //String data type starts with a capital S

        boolean finished = false;
        //boolean indicates either false or true

        float distance = 183.645f;
        //a float is also a decimal number but one must place an f after the variable represented to indicate that its a float

        System.out.println(x);
        System.out.println(y);
        System.out.println(names);
        System.out.println(distance);
        //when you  System.out.println you dont put it in quotes

        //you don't indicate the data type for a known variable

        names = "Mary Jane";
        //to change what is replaced in the variable you write a variable and the new representation
    }
}
