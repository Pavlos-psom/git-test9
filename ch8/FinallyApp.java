package gr.aueb.cf.cf9.ch8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;

        try {
            System.out.println("Please enter number");
            num=scanner.nextInt();
            System.out.println(num);
        } catch (InputMismatchException e) {
            e.getMessage();
            e.printStackTrace();
        }
        finally {
            try {
                if (scanner!=null);
                scanner.close();
            } catch (Exception e) {
                e.getMessage();
                e.printStackTrace();
            }
        }
    }
}
