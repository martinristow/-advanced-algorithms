package Napredni_Algoritmi;
//MARTIN RISTOV - 102620
public class Najmal_Element_Vo_Niza {//kreirame klasa
    public static void main(String[] args) {//glavna funkcija
        int[] niza = {12, 69, 14657, 5654, 92, 45, 3623};//deklarirame niza so elemnti vo samata niza
        int pocetnaPozicija = 2;//se postavuvame na pocetna pozicija vo nizata
        int krajnaPozicija = 5;//krajna pozicija do kaj sto ke proveruvame vo nasata niza

        int najmalBroj = najdiNajmalBroj(niza, pocetnaPozicija, krajnaPozicija);//vo promenlivata najmalBroj go zimame najmaliot
        //broj od funkcijata najdiNajmalBroj
        System.out.println("Pocetna index pozicija na opesot e "+ pocetnaPozicija + " a , krajnata index pozicija e "+krajnaPozicija);//Pecatime pocetna i krajna index pozicija
        System.out.println("Najmaliot broj vo opsegot e: " + najmalBroj);//go pocetame najmaliot broj koj sto sme go pronasle vo nizata
    }

    public static int najdiNajmalBroj(int[] niza, int pocetnaPozicija, int krajnaPozicija) {//kreirame funkcija(metoda) koja sto ima tri parametri
        //i toa niza , pocetna i krajna pozicija
        //proveruvame
        if (pocetnaPozicija == krajnaPozicija) {//pravime sporedba na pocetnata pozicija i krajnata pozicija kade sto
            //ako imaat isti vrednosti ke ni se vrati pocetnata index pozicija vo nizata
            return niza[pocetnaPozicija];//pogore go objasniv
        }

        //Rekurzivno povikuvanje za pomal opseg
        int sredina = (pocetnaPozicija + krajnaPozicija) / 2;//na promenlivata sredina i ja dodeluvame srednata vrednost od pocetnata pozicija i krajnata pozicija
        int najmalVoLevo = najdiNajmalBroj(niza, pocetnaPozicija, sredina);//odime od pocetnata pozicija pa do sredina za da proverime koj e najmal broj tuka a potoa istoto
        int najmalVoDesno = najdiNajmalBroj(niza, sredina + 1, krajnaPozicija);//go pravime i tuka samo sto sea pocnuvame od sredinata pa do krajnata pozicija

        //Sporedba na rezultatite od dvete rekurzii
        return Math.min(najmalVoLevo, najmalVoDesno);//so funkcijata Math.min pravime sporedba na ovie dve vrednosti , poocno ja vrakjame pomalata vrednost
    }
}
