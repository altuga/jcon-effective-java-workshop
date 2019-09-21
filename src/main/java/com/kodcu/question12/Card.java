package com.kodcu.question12;

/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 * 
 * Email : altug@kodcu.com
 * Twitter : @altugaltintas
 */

public class Card {


    enum Suit { CLUB, DIAMOND, HEART, SPADE }
    enum Rank { ACE, DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT,
        NINE, TEN, JACK, QUEEN, KING }


    private final Suit suit ;
    private final Rank rank ;


    public Card(Suit suit,  Rank rank ) {
        this.suit = suit;
        this.rank = rank;
    }


}
