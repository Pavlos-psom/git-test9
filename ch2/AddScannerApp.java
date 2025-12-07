package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class AddScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1=0;
        int num2=0;
        int sum=0;

        System.out.println("Παρακαλώ εισάγετε 2 ακεραίους: ");
        num1 = scanner.nextInt();
        num2 = scanner.nextInt();
        sum=num1+num2;

        System.out.printf("Το άθροισμα των %d και %d είναι %d", num1, num2, sum);

    }
}
