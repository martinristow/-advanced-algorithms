package aud2.cards_by_martin;

import java.util.Objects;

public class PlayingCardByMartin {

    private int rank;
    private PlayingCardTypeByMartin type;

    public PlayingCardByMartin(int rank, PlayingCardTypeByMartin type) {
        this.rank = rank;
        this.type = type;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public PlayingCardTypeByMartin getType() {
        return type;
    }

    public void setType(PlayingCardTypeByMartin type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayingCardByMartin that = (PlayingCardByMartin) o;
        return rank == that.rank && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rank, type);
    }

    @Override
    public String toString() {
        return String.format("%d %s",rank,type.name());
    }

}
