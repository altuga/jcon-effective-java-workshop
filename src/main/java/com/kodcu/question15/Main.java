package com.kodcu.question15;


/*
TODO
 1 - Go to Dessert.java and remove the comment characters
 2 - Just compile Dessert.java and Main.java and try to Run Main class
 3 - Just compile Utensil.java and Main.java and try to Run Main class
 4 - What is the lesson here ?
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(Utensil.NAME + Dessert.NAME);
    }

    private static class Utensil {
        static final String NAME = "pan";
    }

    private static class Dessert {
        static final String NAME = "cake";
    }


}
