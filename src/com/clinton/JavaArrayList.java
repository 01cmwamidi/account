package com.clinton;

import java.util.ArrayList;

public class JavaArrayList {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("James");
        names.add("Mary");
        names.add("Ian");
        names.add("Anthony");
        names.add("Mwangi");
        System.out.println(names.get(1));

        names.remove(2);

        System.out.println(names.size());

        names.clear();

        System.out.println(names.size());


    }
}
