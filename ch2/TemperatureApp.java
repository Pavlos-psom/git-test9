package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class TemperatureApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature=0;
        boolean isTemperatureBelow0=false;

        System.out.println("Παρακαλώ εισάγετε τη θερμοκρασία: ");
        temperature=scanner.nextInt();
        isTemperatureBelow0=temperature<0;

        System.out.printf("Η θερμοκρασία που εβαλες %d βαθμοί, " +
                "είναι κατω από το μηδέν; %b",temperature, isTemperatureBelow0);
    }
}

