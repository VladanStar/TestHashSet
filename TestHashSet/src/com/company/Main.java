package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // kreiranje Hes seta
        Set<String> set = new HashSet<>();

        // dodavanje stringova u Set
        set.add("New York");
        set.add("London");
        set.add("Brisel");
        set.add("Paris");
        set.add("San Francisco");
        set.add("Beijing");
        set.add("Amsterdam");

        System.out.println(set);
        // prikaz elemenata u setu
        for(String str: set){
            System.out.println(str.toUpperCase()+" ");
        }

    }
}
