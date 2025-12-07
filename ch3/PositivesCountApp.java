package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;
/**πληθος των positive numbers how many loops will be needed
 is a case that happens at runtime*/
public class PositivesCountApp {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        int num=0;
        int positives=0;
        System.out.println("please enter a number");


        //διαβαζει μεχρι να βρει ακεραιο αρνητικο (sentinel)
        num=scanner.nextInt();
        while (num >=0) {
            positives++;
            System.out.println("Please enter a number again");
            num=scanner.nextInt();
        }
        System.out.println("The count of positive numbers is "+positives);

    }
}
