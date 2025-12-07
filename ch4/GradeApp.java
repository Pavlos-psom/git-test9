package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class GradeApp {
    public static void main(String[] args) {
        int grade=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give me a number");
        grade=scanner.nextInt();

        switch(grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Below base");
                break;
            case 5:
            case 6:
                System.out.println("Good");
                break;
            case 7:
            case 8:
                System.out.println("Very well");
                break;
            case 9:
            case 10:
                System.out.println("Excellent");
                break;
            default:
                System.out.println("Ο βαθμός να ειναι μεταξύ 1-10");
                break;

        }
    }
}
