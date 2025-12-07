package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class NewSwitchApp {

        public static void main(String[] args) {
            int grade=0;
            Scanner scanner=new Scanner(System.in);
            System.out.println("Give me a number");
            grade=scanner.nextInt();

            switch(grade) {
                case 1, 2, 3, 4 ->

                    System.out.println("Below base");
                case 5, 6 ->
                    System.out.println("Good");

                case 7, 8->
                    System.out.println("Very well");

                case 9, 10->
                    System.out.println("Excellent");

                default-> System.out.println("Ο βαθμός να ειναι μεταξύ 1-10");


            }
        }
    }


