package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

public class TypeCast {
    public static void main(String[] args) {
        int num=0;
        String input="";

        Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter a number");

        input=scanner.nextLine();

        num=Integer.parseInt(input);

        System.out.println("The input number was "+num);
    }
}
