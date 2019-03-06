package com.clinton;

import java.util.Scanner;

public class Capture {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Enter First Number:");
            int x = s.nextInt();
            if (x==555)
                break;

            System.out.println("Enter Second Number:");
            double y = s.nextDouble();

            double results = x * y;
            System.out.println("Results id" + results);
        }
    }
}
