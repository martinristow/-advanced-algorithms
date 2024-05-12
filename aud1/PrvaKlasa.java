package aud1;

public class PrvaKlasa {

 public static boolean isPrefix(String ime1,String ime2)
 {
     if(ime1.length()>ime2.length())return false;
     for(int i=0;i<ime1.length();i++)
         if(ime1.charAt(i)!=ime2.charAt(i))return false;
     return true;



 }

    public static void main(String[] args) {
        System.out.println(isPrefix("Marko","Marko"));
        System.out.println(isPrefix("Marko","Parkoo"));


    }
}
