package aud2.BigComplex;

import java.math.BigDecimal;

public class BigComplexByMartin {
    private BigDecimal imaginaryPart;
    private  BigDecimal realPart;

    public BigComplexByMartin()
    {

    }
    public BigComplexByMartin(BigDecimal imaginaren,BigDecimal realen)
    {
        this.realPart=realen;
        this.imaginaryPart=imaginaren;
    }
    public BigComplex add(BigComplex kompleksen)
    {
        return new BigComplex(this.realPart.add(kompleksen.realPart),this.imaginaryPart.add(kompleksen.imaginaryPart));
        //return new BigComplex(this.realPart.add(kompleksen.realPart),this.imaginaryPart.add(kompleksen.imaginaryPart));
    }
    @Override
    public String toString() {
        return "BigComplexByMartin{" +
                "imaginaryPart=" + imaginaryPart +
                ", realPart=" + realPart +
                '}';
    }

    public static void main(String[] args) {


        BigComplexByMartin kompleks=new BigComplexByMartin(new BigDecimal(5),new BigDecimal(8));
        System.out.println(kompleks.imaginaryPart);
        System.out.println(kompleks.realPart);

    }
}
