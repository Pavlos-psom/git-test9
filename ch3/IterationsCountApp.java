package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;
// o xrhsths valei -1 to progrmmaa stamata

public class IterationsCountApp {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int num=0;
        int iterations=0;

        System.out.println("Please neter a number");

        num=scanner.nextInt();
        while (num!=-1) {
            System.out.println("Please enter again num");
            num=scanner.nextInt();
            iterations++;

        }
        System.out.println("The number of iterations is "+iterations);
    }
}
