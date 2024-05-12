package aud1;

public class PrvaKlasaByMartin {

    public static boolean isPrefix(String prvoIme,String vtoroIme)
    {
        if(prvoIme.length()>vtoroIme.length())return false;
        for(int i=0;i<prvoIme.length();i++)
            if(prvoIme.charAt(i)!=vtoroIme.charAt(i))return false;
        return true;
    }

    public static void main(String[] args) {
        PrvaKlasaByMartin da=new PrvaKlasaByMartin();
        System.out.println(isPrefix("Martin","King"));
        System.out.println(isPrefix("Ma","Ma"));
    }
}
