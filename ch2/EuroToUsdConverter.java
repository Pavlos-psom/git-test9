package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class EuroToUsdConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double euros=0.0;
        final double DOLLAR_VALUE=0.99;
        double dollars=0;

        System.out.println("Παρακαλώ εισάγετε το ποσό σε ευρώ");
        euros=scanner.nextDouble();
        dollars=euros*DOLLAR_VALUE;
        System.out.printf("Το ποσό σε ευρώ αντιστοιχεί σε %2f δολλάρια!", dollars);



    }

}
