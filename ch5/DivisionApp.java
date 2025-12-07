package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class DivisionApp {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double num1=10.5;
        double num2=2.3;
        double result=0.0;
        double remaining=0.0;

        System.out.println("Please enter two numbers");
        num1=scanner.nextDouble();
        num2=scanner.nextDouble();

       result=num1/num2;
       remaining=num1%num2;

        System.out.println("The result="+result+" The remaining = "+remaining);
    }
}
