package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class ToCharArray {
    public static void main(String[] args) {
        String s="";

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter a string");

        s=scanner.nextLine();

        for (char ch: s.toCharArray()) {
            System.out.print(ch+" ");
        }
    }
}
