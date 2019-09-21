package com.kodcu.question38;

import java.util.concurrent.TimeUnit;

/** TODO
* How long would you expect this program to run?
*/
public class StopThread {
    private static boolean stopRequested;  // 4

    // 1

    public static void main(String[] args)
            throws InterruptedException {
        Thread backgroundThread = new Thread(() -> {
            int i = 0;
            while (!stopRequested)  //2
                i++;
            System.out.println("Finito");
        });
        backgroundThread.start();

        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;  // 3

    }
}