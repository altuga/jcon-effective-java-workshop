package com.kodcu.question31;

import java.util.Optional;


/*
TODO
 1 - Run the Max.java
 2 - Fix It
 3 - What is the lesson  ?
*/

public class Ambre {
    public static void main(String[] args) {

        Optional<Cart> cart = Optional.empty();

        if (cart.isPresent()) {
            Cart myCart = cart.get();

            System.out.println(myCart);
        }
    }
}
