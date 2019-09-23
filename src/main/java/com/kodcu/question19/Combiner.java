package com.kodcu.question19;

import java.util.HashSet;
import java.util.Set;


/*
TODO
 1 - Compile Combiner.java
 2 - There are 2 warnings, can you spot the warnings ?
 3 - try to fix those 2 warnings.
*/
public class Combiner {

    //1
     public static <E> Set<E> combine(Set<E> s1, Set<E> s2) {
             Set<E> result = new HashSet<>(s1);
             result.addAll(s2);
             return result;
       }

    // Simple program to exercise generic method
    public static void main(String[] args) {
        Set<String> guys = Set.of("Tom", "Dick", "Harry");
        Set<Integer> ages = Set.of(44, 34, 21);
        Set<String> aflCio = combine(guys, guys);
        System.out.println(aflCio);
    }
}