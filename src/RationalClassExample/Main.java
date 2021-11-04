package RationalClassExample;

public class Main {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 8);
        Rational r2 = new Rational(2, 0);
        System.out.println("Addition: " + r1.add(r2));
        System.out.println("Subtraction: " + r1.subtract(r2));
        System.out.println("Multiplication: " + r1.multiply(r2));
        System.out.println("Division: " + r1.divide(r2));
//
//        Integer.parseInt("12");
//        Double.parseDouble("12.3");
    }
}
