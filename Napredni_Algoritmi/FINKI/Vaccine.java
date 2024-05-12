package Napredni_Algoritmi.FINKI;

import java.util.Objects;

public class Vaccine {
    private int dose;
    private String name;

    public Vaccine(int dose, String name) {
        this.dose = dose;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Vaccine{" +
                "dose=" + dose +
                ", name='" + name + '\'' +
                '}';
    }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
        Vaccine vaccine = (Vaccine) o;
        return dose == vaccine.dose && Objects.equals(name, vaccine.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dose, name);
    }
}
