package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class yearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ageInYears=0;
        int ageInDays=0;
        final int DAY_IN_YEARS=365;
        System.out.println("Παρακαλω εισαγετε την ηλικία σας");
        ageInYears = scanner.nextInt();
        ageInDays=ageInYears* DAY_IN_YEARS;

        System.out.printf("Η ηλικία σε ημερες ειναι %d", ageInDays);
    }
}
