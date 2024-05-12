package aud3.lambda;

public class LambdaTest {

    public static void main(String[] args) {
        FunctionalInterface functionalInterface1= (x,y) ->{//pokompleksno e vaka
            System.out.println("text");
            x++;
            return x+y;
        };

        FunctionalInterface functionalInterface2=(x,y) -> x*y;//poednostavno e vaka
    }
}
