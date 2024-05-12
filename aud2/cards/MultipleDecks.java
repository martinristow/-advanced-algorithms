package aud2.cards;

import java.util.Arrays;

public class MultipleDecks {
    private Deck[] decks;

    public MultipleDecks(int numberOfDecks) {
        this.decks = new Deck[numberOfDecks];
        for(int i=0;i<numberOfDecks;i++)
            decks[i]=new Deck();

    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        for(Deck deck:decks){//ovoj ciklus vaka napisan se vika foreach
        stringBuilder.append(deck.toString());
        stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        MultipleDecks multipleDecks=new MultipleDecks(3);
        System.out.println(multipleDecks);
    }
}
