package com.bueno.truco.domain.entity.deck;

public enum Suit {
    DIAMONDS("Diamonds"),
    SPADES("Spades"),
    HEARTS("Hearts"),
    CLUBS("Clubs");

    String name;
    Suit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
