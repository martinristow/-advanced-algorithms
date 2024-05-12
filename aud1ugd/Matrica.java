package aud1ugd;
import java.util.Scanner;
public class Matrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int sumD1 = 0;
        int sumD2 = 0;
        int[][] matrica = new int[m][n];
        System.out.println("Vnesete gi elementite vo matricata\n");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrica[i][j] = scanner.nextInt();

            }
        }
        System.out.println("Elementi se:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               System.out.print(" "+matrica[i][j]);
           }
            System.out.print("\n");
        }
        for (int i = 0; i < m; i++) {
             for (int j = 0; j < n; j++) {
              if(i==j)
              {
                  sumD1+=matrica[i][j];
              }
              }
            }
        System.out.println("Zbirot na glavnata dijagonala iznesuva "+ sumD1);

        System.out.println("\n");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(i==n-j-1)
                {
                    sumD2+=matrica[i][j];
                }
            }
        }
        System.out.println("Zbirot na sporednata dijagonala iznesuva "+ sumD2);

    }
}