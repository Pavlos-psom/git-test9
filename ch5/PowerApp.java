package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int power=0;
        int base=0;
        int result=1;
        System.out.println("Please enter 2 numbers");
        base=scanner.nextInt();
        power=scanner.nextInt();

        result=power(base, power);
        System.out.printf("The power of %d ^ %d is %d\n",base,power,result);
    }

    public static int power(int num, int power) {
        int result =1;
        for (int i=1; i<=power; i++) {
            result*=num;
        }
        return result;
    }

}
