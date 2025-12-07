package gr.aueb.cf.cf9.ch3;
//αν ο αριθμητης ειναι 0 σταματαει, αν ο παρονομαστης =0 επαναλαμβανεται
import java.util.Scanner;

public class DivisionApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerator=0;
        int denominator=0;
        int result=0;


        while(true) {

            System.out.println("Please insert numerator");
            numerator=scanner.nextInt();
            if (numerator==0) {
                System.out.println("Numerator is 0, quit..");
                break;
            }
            System.out.println("Please insert denominator");
            denominator=scanner.nextInt();
            if (denominator==0) {
                System.out.println("Cannot divide by zero");
                continue;
            }
            result=numerator/denominator;
            System.out.println("Result is "+result);

         }
    }
}
