package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class InputExceptionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        int num = 0;

        System.out.println("Please insert a number");
        while (!scanner.hasNextInt()) {
            System.out.println("Please enter an Integer");
            scanner.nextLine();
        }
        num = scanner.nextInt();
        System.out.println("The num is " + num);
    }
}
