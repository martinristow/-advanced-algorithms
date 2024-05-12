package aud1;

public class MatrixByMartin {
    //suma
    public static double suma(double[][] matrica)
    {
        double sumaa=0;
        for(int i=0;i<matrica.length;i++)
            for(int j=0;j<matrica[0].length;j++)
                sumaa+=matrica[i][j];
        return sumaa;

    }
    //sredna_vrednost
    public static double sredna_vrednost(double[][]matrica){
        return suma(matrica)/(matrica.length*matrica[0].length);
    }
    //glavna_funkcija -main
    public static void main(String[] args) {
        MatrixByMartin cisto_onaka=new MatrixByMartin();
        double[][] matrica={{6,4,2},{2,6,3}};
        double soberi=suma(matrica);
        double najdi_sredna_vrednost=sredna_vrednost(matrica);
        System.out.println(soberi);
        System.out.println(najdi_sredna_vrednost);
    }

}
