package com.kodcu.question02;


import java.util.concurrent.TimeUnit;

/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 * 
 * Email : altug@kodcu.com
 * Twitter : @altugaltintas
 */

/*
TODO 
 1 - Measure the performance of the main() method in MILLISECONDS
 2 - Discussion : Did you feel any abnormality about the performance ?
 3 - Instructor will show the solutions
 4 - Refactor
*/
public class Sum {
    private static long sum() {
        Long sum = 0L;
        for (long i = 0; i <= Integer.MAX_VALUE; i++)
            sum += i; // Autoboxing
        return sum;
    }

    public static void main(String[] args) {
      long start = System.nanoTime(); // always use nanotTime for accuracy
      sum();
      long end = System.nanoTime();
      System.out.println(  TimeUnit.MILLISECONDS.convert( (end - start), TimeUnit.NANOSECONDS) +  " ms..");


    }
}