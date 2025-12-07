package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {
        int factorial=0;
        int num=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please put the right nymber");
        num=scanner.nextInt();
        factorial=facto(num);
        System.out.printf("The factorial of %d is %d",num, factorial);


    }

    public static int facto(int n) {
        int result=1;
       for (int i =1; i<=n; i++) {
           result*=i;
       }
       return result;
    }

}
