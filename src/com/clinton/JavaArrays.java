package com.clinton;

public class JavaArrays {
    public static void main(String[] args) {
        int marks[] = {78,75,45,767,23432,6557,5675,565675,545};
        //immutable
        String names [] = {"Kim","Jim","Joan","Jack","Jerry"};
        System.out.println( marks[0]);
        try{
            System.out.println(names[9]);
        }
        catch (Exception e)
        {
            System.out.println("Error while fecthing the name");
        }

    }
}
