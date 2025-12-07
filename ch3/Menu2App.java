package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

//εμφανιζει ενα μενθ μεχρι ο χρηστης να πειλεξει exit
public class Menu2App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice=0;

        while (true){
            System.out.println("Παρακαλώ επιλέξτε ενα απο τα παρακάτω");
            System.out.println("1.Εισαγωγή αίτησης ");
            System.out.println("2.Διαγραφή αίτησης");

            System.out.println("3.Εξοδος");
            choice=scanner.nextInt();

      if (choice==3) {
         break;
      }
    }
}
}

