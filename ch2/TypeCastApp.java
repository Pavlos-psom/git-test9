package gr.aueb.cf.cf9.ch2;

public class TypeCastApp {
    public static void main(String[] args) {
        long myLong = 2_147_647;
        int myInt = (int)myLong;

        System.out.println(myLong);
        System.out.println(myInt);
        System.out.printf("my Long is: %,06d", myLong);
    }
}
