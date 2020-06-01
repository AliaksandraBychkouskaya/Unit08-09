package by.tr.mod8;

public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(){
        this.denominator = this.numerator = 1;
    }
    public Fraction(int a, int b){
        this.numerator = a;
        this.denominator = b;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0)
        {this.denominator = 1;}
        else
        this.denominator = denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void printFraction(){
        System.out.println(numerator + "/"+ denominator);
    }

}

