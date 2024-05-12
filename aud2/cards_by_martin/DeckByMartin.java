package aud2.cards_by_martin;

import aud2.cards.Deck;
import aud2.cards.PlayingCard;

import java.util.*;

public class DeckByMartin {
    //52 karti
    private PlayingCardByMartin[] cards;
    private int dealCards;
    private boolean[] isDealt;

    public DeckByMartin() {
        cards =new PlayingCardByMartin[52];
        isDealt=new boolean[52];
        dealCards=0;

        for(int i=0;i<PlayingCardTypeByMartin.values().length;i++)
            for(int j=0;j<13;j++)
                cards[i*13+j]=new PlayingCardByMartin(j+2,PlayingCardTypeByMartin.values()[i]);

    }

    public PlayingCardByMartin[] getCards() {
        return cards;
    }

    public void setCards(PlayingCardByMartin[] cards) {
        this.cards = cards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeckByMartin that = (DeckByMartin) o;
        return dealCards == that.dealCards && Arrays.equals(cards, that.cards) && Arrays.equals(isDealt, that.isDealt);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(cards);
    }

    @Override
    public String toString() {
       StringBuilder stringBuilder=new StringBuilder();
       for(PlayingCardByMartin card:cards){
           stringBuilder.append(card.toString());
        stringBuilder.append("\n");}

        return stringBuilder.toString();
    }
    //proverka dali ima ostanato karti
    public boolean hasCardsLeft(){
        return (cards.length-dealCards>0);
    }
    //metod shuffle();
    public PlayingCardByMartin[] shuffle(){
       List<PlayingCardByMartin> karti=Arrays.asList(cards);
        Collections.shuffle(karti);
        return cards;
    }
    //metod dealCard();
    public PlayingCardByMartin dealCard()
    {
        if(!hasCardsLeft())return null;
        int card=(int)(Math.random()*52);
        if(!isDealt[card]){
            isDealt[card]=true;
            dealCards++;
        }
        return dealCard();
    }

    public static void main(String[] args) {
        DeckByMartin deck1=new DeckByMartin();
        System.out.println(deck1);
        System.out.println("\n");
       deck1.shuffle();
        System.out.println(deck1);
        PlayingCardByMartin card;
        while((card=deck1.dealCard())!=null){
            System.out.println(card);
        }
        System.out.println();
        Deck deck2=new Deck();
        System.out.println(deck2);
    }




}
