package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

         int num=0;
         int power=0;
         int result=1;
        System.out.println("Please enter a number");
        num=scanner.nextInt();
        System.out.println("Please enter a power");
        power=scanner.nextInt();

        for (int i=1; i<=power; i++) {
            result*=num;

        }
        System.out.println("The result is "+result);



    }

}
