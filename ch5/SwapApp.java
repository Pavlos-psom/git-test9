package gr.aueb.cf.cf9.ch5;

public class SwapApp {
    public static void main(String[] args) {
    int a=10;
    int b=20;

        System.out.printf("The values of %d and %d are",a,b);

        swap(a,b);
        System.out.println();
        System.out.printf("The values of %d and %d are",a,b);


    }

    public static void swap(int a, int b) {
        int temp=0;
        temp=a;

        a=b;
        b=temp;
    }
}
