package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class SnowingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature=0;
        boolean isRaining=false;
        boolean isSnowing=false;

        System.out.println("Παρακαλώ εισάγετε αν βρέχει");
        isRaining=scanner.nextBoolean();
        System.out.println("Παρακαλώ εισάγετε τη θερμοκρασία");
        temperature=scanner.nextInt();
        isSnowing=isRaining && temperature<0;
        System.out.println("Τελικά χιονίζει;"+isSnowing);
    }

}
