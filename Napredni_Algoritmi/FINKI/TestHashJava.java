package Napredni_Algoritmi.FINKI;

import java.util.*;

public class TestHashJava {
    public static void main(String[] args) {
        /*Map<Vaccine,String> map = new HashMap<>();//edna opcija e ova
       // Map<Vaccine,String> map = new TreeMap<>();//druga opcija e ova
        //a razlikata e toa sto TreeMap gi cuva sortirani spored klucot a hashmap ne gi cuva sortirani
        //toe e glavnata razlika
        Vaccine vaccine1=new Vaccine(1,"PHY");
    map.put(vaccine1,"John");
    map.put(vaccine1,"Martin");//znaci so ovoj primer vaka doagja do prepokrivanje na prethodniot element
        //zatoa mora da koristime lista vo samata mapa toa ke go napravime podolu a ovoj kod ke bide komentiran
        System.out.println(map);*/

        Map<Vaccine,List<String>> map = new HashMap<>();//vaka e podobro so lista bidejki nema da
        //ima prepokrivanje na elementite a ke moze da se vnesat povise elementi
        Vaccine vaccine1= new Vaccine(1,"PHY");
        Vaccine vaccine2= new Vaccine(2,"PHY");
        Vaccine vaccine3= new Vaccine(1,"AZ");
        Vaccine vaccine4= new Vaccine(2,"AZ");

        map.put(vaccine1,new ArrayList<>());//znaci site lugje so primile vakcina1 da ima
        //nova ArrayLista isto i za ostanatite vakcini za tie podatoci tamu da se zacuvuvaat
        map.put(vaccine2,new ArrayList<>());
        map.put(vaccine3,new ArrayList<>());
        map.put(vaccine4,new ArrayList<>());

        map.get(vaccine1).add("Martin");//sega ovde velime map.get dajmi go vakcina1 delot , a tamu
        //ke ni vrati ArrayLista a sea na taa Arraylista dodaj go toj sto sakas da bide primer Martin , Dusica itd.
        //znaci ova add e na listata , a get ni ja vrakja listata od vakcinirani so vakcina1 i sea nie so nea
        //sto sakame mozeme da praveme , primer da dodademe nekoj john itd.
        map.get(vaccine1).add("Ana");
        map.get(vaccine1).add("Dusca");
        map.get(vaccine1).add("Markio");

        map.get(vaccine2).add("Martin");
        map.get(vaccine2).add("Ana");
        map.get(vaccine2).add("Dusica");
        map.get(vaccine2).add("Marko");

        map.get(vaccine3).add("Martin");
        map.get(vaccine3).add("Ana");
        map.get(vaccine3).add("Dusica");
        map.get(vaccine3).add("Marko");

        map.get(vaccine4).add("Martin");
        map.get(vaccine4).add("Ana");
        map.get(vaccine4).add("Dusica");
        map.get(vaccine4).add("Marko");

        System.out.println("\n"+map+"\n");
    }
}
