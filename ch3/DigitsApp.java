package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class DigitsApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=0;
        int count=1;
        int input=0;
        System.out.println("Παρακαλώ εισαγετε τον αριθμό");
        num=scanner.nextInt();
        input=num;
        while(num/10>0) {
            num=num/10;
            count++;
        }
        System.out.printf("Ο αριθμός %d αποτελειταια πο %d ψωφια",input, count);

    }
}
