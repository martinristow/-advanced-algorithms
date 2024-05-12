package aud2.BigComplex;

import java.math.BigDecimal;

public class BigComplex {
    BigDecimal realPart;//BigDecimal e klasa od java zatoa ja koristime vo ovaa zadaca
    BigDecimal imaginaryPart;

    public BigComplex() {
    }

    public BigComplex(BigDecimal realPart, BigDecimal imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }
public BigComplex add(BigComplex complex){//moze i vaka a moze i kako dolu podole
return new BigComplex(this.realPart.add(complex.realPart),this.imaginaryPart.add(complex.imaginaryPart));
//ovde morase so add metod bidejki se wraper klasi onaka ne mozat da se sobirat
}
//public static BigComplex add(BigComplex complex1,BigComplex complex2)
//{

//}
    @Override
    public String toString() {
        return "BigComplex{" +
                "realPart=" + realPart +
                ", imaginaryPart=" + imaginaryPart +
                '}';
    }

    public static void main(String[] args) {
        //ovde ne napisa test primeri profesorkata Ana

        //овие тест примери се од чат гпт
        BigComplex complex1 = new BigComplex(new BigDecimal("2"), new BigDecimal("3"));
        BigComplex complex2 = new BigComplex(new BigDecimal("1.5"), new BigDecimal("2.5"));

        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);

        // Пример за собирање на комплексни броеви
        BigComplex sum = complex1.add(complex2);
        System.out.println("Sum: " + sum);

        // Пример за форматирање на комплексен број
       // System.out.println("Formatted Sum: " + sum.format());

        // Пример за стварање комплексен број со нултa делови
        BigComplex zeroComplex = new BigComplex(BigDecimal.ZERO, BigDecimal.ZERO);
        System.out.println("Zero Complex: " + zeroComplex);

        // Пример за собирање на комплексни броеви со нултa делови
        BigComplex sumWithZero = complex1.add(zeroComplex);
        System.out.println("Sum with Zero: " + sumWithZero);



    }
}
