package by.tr.mod8;
import java.util.Random;
import java.util.Scanner;
public class FractionTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = 5;
        Fraction [] masFractions = new Fraction[k];
        for (int i = 0; i < k; i++){
            masFractions[i] = new Fraction();
            System.out.println("Enter numerator of "+ (i+1)+ " fraction");
            masFractions[i].setNumerator(sc.nextInt());
            System.out.println("Enter denominator of "+ (i+1) + " fraction");
            masFractions[i].setDenominator(sc.nextInt());
        }
        for (int i = 0; i < k; i++){
            masFractions[i].printFraction();
        }
    }
}
