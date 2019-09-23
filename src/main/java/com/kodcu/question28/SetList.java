package com.kodcu.question28;

import java.util.*;

/**
 *
 * TODO
 *
 * 1 - What does this program print?
 * 2 - How can you fix it ?
 *
 */

public class SetList {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i = -3; i < 3; i++) {
            set.add(i);
            list.add(i);
        }
        for (int i = 0; i < 3; i++) {
            set.remove(i);
            list.remove(Integer.valueOf(i));; //2
        }
        System.out.println(set + " " + list);
    }
}
