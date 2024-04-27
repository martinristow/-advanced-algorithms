//MARTIN RISTOV - 102620

package Napredni_Algoritmi;

import java.util.Arrays;

public class Binarno_prebaruvanje {

public static int binarno_prebaruvanje(int[] niza,int vrednost){
int start=0;//poceten kraj na nizata koj pokazuva na pozija so index 0 , bidejki toa e pocetnata
    //vrednost vo nashata niza
int end=niza.length-1;//posleden kraj na nizata kade shto ako nizata ima 7 elementi togas
    //indexot na nasiot posleden broj ke ima index so broj 6 bidejki site broevi ni pocnuvaat od 0
while (start<=end){//while ciklus koj ke go izvrsuvame se dodeka startot e pomal ili ednakov od krajot na nizata
    //znaci nia odstranuvame delovi od nizata i gi zanemaruvame vo ovoj slucaj i toa se slucuva se dodeka
    //e ispolnet toj uslov
int sreden=(start+end)/2;//vo promenlivata sreden go dodeluvame sredniot element od samata niza
if(niza[sreden]==vrednost)//ako srednata vrednost od nizata e ednakva so vrednosta od glavnata funkcija  togas
    return sreden;//ke ja vratime promenlivata sreden so komandata return sreden;
else if (niza[sreden]<vrednost)//ako srednata vrednost e pomala od vrednosta koja e zadadena togas
    //site vrednosti levo od toj broj e pomali so znaci deka treba da se pomestime vo samata niza
    start=sreden+1;//sega start go pomestuvame na sreden+1
    else end=sreden-1;//a krajot go namaluvame za edna pozicija nazad

}
return -1;
    }

    public static void main(String[] args) {//glavna funkcija
int[] niza={100,2,4,6,7,9,10,500};//kreirame edna pomosna promenliva vo koja ke gi cuvame vrednostite
        for(int i=0;i<niza.length;i++)//so ovoj for ciklus gi izminuvame site elementi vo nizata
        {
            Arrays.sort(niza);//ja sortirame nizata so funkcijata Arrays.sort
            System.out.print(niza[i]+" ");//gi pecatime site elementi od samata niza
        }
        System.out.println();
        System.out.println(binarno_prebaruvanje(niza,6));//tuka ja proveruvame vrednosta 6 vo nasata niza
    }
}


