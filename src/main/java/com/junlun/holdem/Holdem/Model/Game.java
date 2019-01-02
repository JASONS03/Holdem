package com.junlun.holdem.Holdem.Model;

import java.util.Arrays;

public class Game {
    public CommunityCard communityCard;
    public Player player0;
    public Player player1;
    private boolean[] cardSet;
    private int numOfLeft;

    public Game() {
        cardSet = new boolean[53];
        Arrays.fill(cardSet, Boolean.TRUE);
        this.numOfLeft = 52;
    }
    private void getCard(Card card) {
        if(card == null) return;
        cardSet[card.val] = false;
        numOfLeft--;
    }
    private void returnCard(Card card) {
        if(card == null) return;
        cardSet[card.val] = true;
        numOfLeft++;
    }
    public void updatePlayer0(Player player0, Card newCardOne, Card newCardTwo) {
        returnCard(player0.cardOne);
        returnCard(player0.cardTwo);
        this.player0 = new Player("player0", newCardOne, newCardTwo);
        getCard(newCardOne);
        getCard(newCardTwo);
    }
    public void updatePlayer1(Player player1, Card newCardOne, Card newCardTwo) {
        returnCard(player1.cardOne);
        returnCard(player1.cardTwo);
        this.player1 = new Player("player1", newCardOne, newCardTwo);
        getCard(newCardOne);
        getCard(newCardTwo);
    }
    public void updateCommunityCard(Card newCardOne, Card newCardTwo, Card newCardThree, Card newCardFour, Card newCardFive) {
        returnCard(communityCard.cardOne);
        returnCard(communityCard.cardTwo);
        returnCard(communityCard.cardThree);
        returnCard(communityCard.cardFour);
        returnCard(communityCard.cardFive);
        this.communityCard = new CommunityCard(newCardOne, newCardTwo, newCardThree, newCardFour, newCardFive);
        getCard(newCardOne);
        getCard(newCardTwo);
        getCard(newCardThree);
        getCard(newCardFour);
        getCard(newCardFive);
    }
    public long getChance() {
        return 0/numOfLeft;
    }

}
