package com.junlun.holdem.Holdem.Model;

public class CommunityCard {
    public final Card cardOne;
    public final Card cardTwo;
    public final Card cardThree;
    public final Card cardFour;
    public final Card cardFive;
    public CommunityCard(Card cardOne, Card cardTwo, Card cardThree, Card cardFour, Card cardFive) {
        this.cardOne = cardOne;
        this.cardTwo = cardTwo;
        this.cardThree = cardThree;
        this.cardFour = cardFour;
        this.cardFive = cardFive;
    }
}
