package RationalClassExample;

public class Rational extends Number implements Comparable<Rational> {
    private long numerator;
    private long denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    @Override
    public int intValue() { // 1,333334 -> 1, 4/3, 1/3 -> 0,33334 -> 0
        return (int) (numerator / denominator);
    }

    @Override
    public long longValue() {
        return (numerator / denominator);
    }

    @Override
    public float floatValue() {
//        return (((float) numerator) / denominator);
        return (float)doubleValue();
    }

    @Override
    public double doubleValue() {
        return (((double) numerator) / denominator);
    }

    public Rational(long numerator, long denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public long getNumerator() {
        return numerator;
    }

    public long getDenominator() {
        return denominator;
    }

    public Rational add(Rational secondRational) {
        long denominatorOfFirst = denominator;
        long numeratorOfFirst = numerator;
        long denominatorOfSecond = secondRational.getDenominator();
        long numeratorOfSecond = secondRational.getNumerator();
        if (denominatorOfSecond == denominatorOfFirst) {
            long numerator = numeratorOfFirst + numeratorOfSecond;
            long denominator = denominatorOfFirst;

            long gcd = gcd(numerator, denominator);
            numerator = numerator / gcd;
            denominator = denominator / gcd;
            return new Rational(numerator, denominator);
        } else {
            numeratorOfFirst *= denominatorOfSecond;
            numeratorOfSecond *= denominatorOfFirst;
            long numerator = numeratorOfFirst + numeratorOfSecond;
            long denominator = denominatorOfFirst * denominatorOfSecond;

            long gcd = gcd(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;
            return new Rational(numerator, denominator);
        }
    }

    public Rational subtract(Rational secondRational) {
        long denominatorOfFirst = this.denominator;
        long numeratorOfFirst = this.numerator;
        long denominatorOfSecond = secondRational.getDenominator();
        long numeratorOfSecond = secondRational.getNumerator();
        if (denominatorOfSecond == denominatorOfFirst) {
            long numerator = numeratorOfFirst - numeratorOfSecond;
            long denominator = denominatorOfFirst;

            long gcd = gcd(numerator, denominator);
            numerator = numerator / gcd;
            denominator = denominator / gcd;
            return new Rational(numerator, denominator);
        } else {
            numeratorOfFirst *= denominatorOfSecond;
            numeratorOfSecond *= denominatorOfFirst;
            long numerator = numeratorOfFirst - numeratorOfSecond;
            long denominator = denominatorOfFirst * denominatorOfSecond;

            long gcd = gcd(numerator, denominator);
            numerator /= gcd;
            denominator /= gcd;
            return new Rational(numerator, denominator);
        }
    }

    public Rational multiply(Rational secondRational) {
        long numerator = this.numerator * secondRational.numerator;
        long denominator = this.denominator * secondRational.denominator;
        long gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        return new Rational(numerator, denominator);
    }

    public Rational divide(Rational secondRational) {
        // (1/7) / (2/9) = (1*9) / (7*2)
        long numerator = this.numerator * secondRational.denominator;
        long denominator = this.denominator * secondRational.numerator;

        long gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
        return new Rational(numerator, denominator);
    }

    @Override
    public String toString() {
        if (denominator == 1)
            return numerator + "";
        else
            return numerator + "/" + denominator;
    }

    private long gcd(long n, long d) { // 2/4 * 4/8 = 8/32 8/8 = 1, 32/8 = 4 -> 1/4
        long max = Math.max(n, d);
        long min = Math.min(n, d);
        long gcd = 1;
        for (long i = 1; i <= min; i++) { // overflow
            if ((max % i == 0) && (min % i == 0))
                gcd = i;
        }
        return gcd;
    }

    @Override
    public int compareTo(Rational r) {
        if (this.subtract(r).getNumerator() < 0)
            return -1;
        else if (this.subtract(r).getNumerator() == 0)
            return 0;
        else
            return 1;
    }
}
