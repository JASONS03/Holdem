package com.junlun.holdem.Holdem.Model;

public class Player {
    public final String name;
    public final Card cardOne;
    public final Card cardTwo;

    public Player(String name, Card cardOne, Card cardTwo) {
        this.name = name;
        this.cardOne = cardOne;
        this.cardTwo = cardTwo;
    }
}
