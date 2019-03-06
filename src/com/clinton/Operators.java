package com.clinton;

public class Operators {
    public static void main(String[] args) {
        System.out.println(10+20);
        String fname = "John";
        String lname = "Kim";
        int age =21;
        String full_name = fname + " " + lname + " " + age;
        System.out.println(full_name);
        System.out.println(10/(double)3);
        //casting is basically converting something
        int z = 10;
        System.out.println( (double)z );
        int k = (int)10.99;
        System.out.println(k);
        System.out.println(10>20);
        System.out.println(10 <=20);
        System.out.println(10 == 10.0);

        int j =10;
        double l =10.0;
        System.out.println(j == l);

        String name = "Terry";
        String jina = "terry";
        System.out.println(name == jina);
        System.out.println( name.equalsIgnoreCase(jina) );
        System.out.println(1000 % 44); //modulus

        //and
        System.out.println(10 > 20 && "Jina".equals("Jina"));
        //or
        System.out.println(100 >200 || "jina".equals("jina"));
        //not equal
        System.out.println(10 != 20);
        System.out.println(! "kenya".equals("Kenya"));
    }
}
