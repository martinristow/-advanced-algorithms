package aud2.cards_by_martin;

import java.util.Arrays;

public class MultipleDecksByMartin {
    private DeckByMartin[] decks;

    public MultipleDecksByMartin(int decks) {
        this.decks = new DeckByMartin[decks];
        for (int i = 0; i < decks; i++)
            this.decks[i] = new DeckByMartin();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (DeckByMartin deck : decks) {
            stringBuilder.append(deck);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        MultipleDecksByMartin povise=new MultipleDecksByMartin(3);
        System.out.println(povise);
    }
}
