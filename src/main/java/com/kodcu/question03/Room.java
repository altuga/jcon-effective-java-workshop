package com.kodcu.question03;


/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 * 
 * Email : altug@kodcu.com
 * Twitter : @altugaltintas
 */

//2
public class Room implements AutoCloseable{


    int numJunkPiles; // Number of junk piles in this room

    public Room(int numJunkPiles) {
        this.numJunkPiles = numJunkPiles;
    }

    @Override
    public void close()  {
        this.numJunkPiles = 0 ;
        System.out.println("Room is cleaned ... " + numJunkPiles);
    }





}
