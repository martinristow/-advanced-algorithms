package Napredni_Algoritmi.FINKI;

public class HanoiTower {
    public static void hanoi(int n, char source, char target, char auxiliary) {
        if (n > 0) {
            // Пренеси ги првите (n-1) дискови од изворот на помошниот столб
            hanoi(n - 1, source, auxiliary, target);

            // Пренеси го последниот диск од изворот на целевниот столб
            System.out.println("Пренеси диск " + n + " од " + source + " на " + target);

            // Пренеси ги првите (n-1) дискови од помошниот столб на целевниот столб
            hanoi(n - 1, auxiliary, target, source);
        }
    }
    public static void main(String[] args) {
        int numberOfDisks = 3;
        char sourcePeg = 'A';
        char targetPeg = 'C';
        char auxiliaryPeg = 'B';

        hanoi(numberOfDisks, sourcePeg, targetPeg, auxiliaryPeg);
    }
}
