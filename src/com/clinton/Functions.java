package com.clinton;

import java.util.Scanner;

public class Functions {

    //non-static

        private double volumeSphere(double radius){
        double volume = 22/7.0 * Math.pow(radius,3)* 4/3.0;
        return volume;
    }

    //static
    public static double areaCircle(double radius){
        double area = 22/7.0 * radius * radius;
        return area;
    }
//void doesn't return anything
    public static void main(String[] args) {

       //objects == variables

        Functions f = new Functions();
        System.out.println(f.volumeSphere(5));

       double v = f.volumeSphere(11.11);
        System.out.println(Math.sqrt(v));




        Scanner s = new Scanner(System.in);

         {
            System.out.println("Enter Radius:");
            double a =areaCircle(s.nextDouble());


             System.out.println("This Is The Area:");
             System.out.println(a);
        }











        /* areaCircle(7);
        areaCircle(9.1);
        areaCircle(106.43);

        double result = areaCircle(11.114556);
        System.out.println(Math.round(result));
        System.out.println(result * 12);*/

    }
}
