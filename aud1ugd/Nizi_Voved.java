package aud1ugd;
import java.util.Scanner;//za citanje od tastatura

public class Nizi_Voved {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);//za citanje od tastatura

            int suma=0;
            int i=0;
            int[] ocenki = new int[5];
            System.out.println("Vnesete ocenki :");
            for(i=0;i<5;i++)
            {
                ocenki[i]=scanner.nextInt();
            }

            for(i=0;i<5;i++)
    {

        System.out.print(" "+ocenki[i]);
        suma=suma+ocenki[i];


    }

        System.out.println("\nProsek : "+suma/5);
    }
}
