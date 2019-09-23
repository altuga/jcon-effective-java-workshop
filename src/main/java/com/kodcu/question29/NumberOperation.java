package com.kodcu.question29;


import java.util.List;

/*
TODO
 1 - Run the NumberOperation.java
 2 - Is this the best way for sum() and min() methods?
 3 - Instructor will show the solutions
 4 - What is the lesson  ?
*/
public class NumberOperation {

    static int sum(List<Integer> intList) { //1
        int sum = 0;
        for (int arg : intList)
            sum += arg;
        return sum;
    }


    //2
    static int min(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for (int arg : remainingArgs)
            if (arg < min)
                min = arg;
        return min;
    }


    public static void main(String[] args) {
        System.out.println(sum(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)));
        System.out.println(min(29, 3,5,7));
    }
}
