package aud1ugd;

public class Rekurzija_Kilim {

    static void pechatiRed(int n, char znak){
        if(n==0) {
            System.out.println("\n");
            return;
        }
        System.out.print(znak);
        pechatiRed(n-1,znak);
    }
    static void Kilim(int n){
    if(n==0)
    {
        return;
    }
    if(n%2==0)
    {
        pechatiRed(n,'#');
    }
    else {
        pechatiRed(n,'*');
    }
    Kilim(n-1);
}

    public static void main(String[] args) {

        Kilim(8);
    }
}


