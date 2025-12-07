package gr.aueb.cf.cf9.ch8;


import java.time.LocalDateTime;
import java.util.Scanner;

/**
 * Η {@link BankApp} παρέχει μία μόνο υπηρεσία,
 * την υπηρεσία κατάθεσης.
 */
public class BankApp {


    static double balance;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = 0.0;
        int count=0;
        while (true) {
            try {
                System.out.println("Please deposit a number");
                amount = scanner.nextDouble();
                deposit(amount);
                System.out.println("The balance is " + balance);
                withdrow(amount);
                System.out.println("The balance is " + balance);
                count++;
            } catch (Exception e) {
                e.getMessage();

            }
            if(count==6)
                System.out.println("The final balance is "+balance);
                break;

        }
    }

    public static void deposit(double amount) throws  Exception{
        try {
            if (amount<0) throw new Exception("Amount cannot be negative");
            balance+=amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now()+e.getMessage());
            throw e;
        }
    }

    public static void withdrow(double amount) throws  Exception{
        try {
            if (amount<0) throw new Exception("Amount cannot be negative");
            balance-=amount;
        } catch (Exception e) {
            System.err.println(LocalDateTime.now()+e.getMessage());
            throw e;
        }
    }
}