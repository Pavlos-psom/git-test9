package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        int num=0;
        int factorial=1;
        int i=1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Παρακαλώε ισάγετε το παραγοντικό");

        num=scanner.nextInt();
        while(i<=num) {
           factorial*=i;
           i++;

        }
        System.out.printf("The factorial of %d = %d\n", num, factorial);
    }
}
