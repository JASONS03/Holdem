package com.junlun.holdem.Holdem.Model;

public class Card {
    public final Integer suits;
    public final Integer number;
    public final Integer val;

    public Card(Integer suits, Integer number) {
        this.suits = suits;
        this.number = number;
        if(suits != null && number != null) {
            this.val = suits * number;
        }else{
            this.val = 0;
        }
    }
}
