package aud1ugd;

import java.util.Scanner;

public class Rekurzija {

    int funkcija(int a) {

        if (a == 0)
           return 0;
        System.out.print(" "+a);
        funkcija(a / 10);
        return a;



    }

    public static void main(String[] args) {
        Rekurzija test = new Rekurzija();
        //Scanner scanner = new Scanner(System.in);
        //test.funkcija(scanner.nextInt());
        test.funkcija(12345678);

    }
}


