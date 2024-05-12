package aud1ugd;
import java.util.Scanner;//za citanje od tastatura
public class Nizi_VtorDel {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//za citanje od tastatura
        int n=scanner.nextInt();
        int[] niza=new int[n];
        for(int i=0;i<n;i++)
        {
            niza[i]=scanner.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            if(niza[i] % 2 ==0)
            {
                niza[i]++;
            }
            else{
                niza[i]--;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+niza[i]);
        }
    }

}
