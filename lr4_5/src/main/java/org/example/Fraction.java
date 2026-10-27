package org.example;

public class Fraction {
    private int numerator;
    private int denominator;

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction(int numerator, int denominator) {
        setNumerator(numerator);
        setDenominator(denominator);

    }

    public double toDecimal() {
        return (double) numerator / denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
