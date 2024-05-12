package aud3.lambda;

public class AnonymousClassExample {
    //Anonimna klasa e klasa koja sto nema ime i za edna upotreba e .
    //Sekoja anonimna klasa mora da implementira interfejs
    FunctionalInterface Addition = new FunctionalInterface() {
        @Override
        public double doOperation(double a, double b) {
            return a+b;
        }
    };

    public static void main(String[] args) {
        AnonymousClassExample example=new AnonymousClassExample();
        System.out.println(example.Addition.doOperation(5,3));
    }
}
