package gr.aueb.cf.cf9.ch1;

public class AddApp {
    public static void main(String[] args) {
        int num1 = 50_000;
        int num2 = 10_000;

        int result;

         result = num1 + num2;

        System.out.println("Το αποτέλεσμα είναι "+ result);
        System.out.println("Το αποτέλεσμα των "+ num1 + " + " +num2+ "είναι "+ result);
        System.out.printf("Το αποτέλεσμα %,d, %,d είναι %,d\n", num1, num2, result);

    }
}
