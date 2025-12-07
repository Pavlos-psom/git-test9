package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class NumberExceptionApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.println("Please insert a string");

        while (!isInteger(scanner.nextLine())) {
            System.out.println("Insert a char!");
        }
        s=scanner.nextLine();
        System.out.println("The correct line is "+s);



    }

    public static boolean isInteger(String s) {
        return s.matches("-?[0-9]+");
    }
}
