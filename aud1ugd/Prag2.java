


package aud1ugd;
import java.util.Scanner;
public class Prag2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int broj=scanner.nextInt();
        int m = scanner.nextInt();
        int n=scanner.nextInt();
        int suma=0;
        int[][]matrica=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                matrica[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            suma=0;

            for(int j=0;j<m;j++)
            {
                suma+=matrica[j][i];
            }
            if(suma>broj)//AKO SUMATA E POGOLEMA OD BROJOT TOGAS NA REDICATA I DODELUVAME KECOVI ISTO I ZA DRUGITE
            {
                for(int j=0;j<n;j++)
                {
                    matrica[j][i]=1;
                }
            }else if(suma<broj)
            {
                for(int j=0;j<n;j++)
                {
                    matrica[j][i]=-1;
                }
            }else if(suma==broj)
            {
                for(int j=0;j<n;j++)
                {
                    matrica[j][i]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+matrica[i][j]);
            }
            System.out.print("\n");
        }
    }//OVAA ZAGRADA E ZA MAINO SO ZAVRSUVA
    }

