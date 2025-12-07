package gr.aueb.cf.cf9.ch5;

public class MethodOverloading {


    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=3;

        int sum=0;
        long a1=1L;
        long b1=2L;


    }

    public int add(int num1, int num2) {
        return num1+num2;
    }

    public long add(long num1, long num2) {
        return num1+num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1+num2+num3;
    }
}
