package aud1;

import java.util.Scanner;

public class Matrix {
 public static double sum(double[][] matrix)
 {
     double sum=0;
     for(int i=0;i<matrix.length;i++)
         for(int j=0;j<matrix[0].length;j++)
             sum+=matrix[i][j];
     return sum;
 }
 public static double avg(double[][] matrix)
 {
     return sum(matrix)/(matrix.length*matrix[0].length);
 }

    public static void main(String[] args) {
        double[][] matrica={{5,6,8},{3,9,7}};

        System.out.println(sum(matrica));
        System.out.println(avg(matrica));
    }
}


