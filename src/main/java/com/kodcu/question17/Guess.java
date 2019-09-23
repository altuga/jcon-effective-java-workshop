package com.kodcu.question17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


/*
TODO
 1 - Run the Guess app
 2 - Any abnormality ? Please try to fix it
 3 - Instructor will show the solutions
 4 - What is the lesson  ?
*/

public  class  Guess<T>  {//1
    private final List<T> choiceList;  //2

    //3
    public Guess(Collection<T> choices) {
            choiceList = new ArrayList<>(choices);
    }

    // 4
    public T choose() {
            Random rnd = ThreadLocalRandom.current();
            return choiceList.get(rnd.nextInt(choiceList.size()));

    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4, 5, 6);

        List<String> stringList = List.of("one", "two", "three", "four", "five", "six");

        Guess<String> guess = new Guess<String>(stringList); // 5

        for (int i = 0; i < 10; i++) {
            String choice =  guess.choose();
            System.out.println(choice);
        }

        Guess<Integer> guess2 = new Guess<Integer>(intList);

        for (int i = 0; i < 10; i++) {
            Integer choice =  guess2.choose();
            System.out.println(choice);
        }

    }
}
