package gr.aueb.cf.cf9.ch5;

public class FactorialRecruisiveApp {
    public static void main(String[] args) {

    }

    public static int facto(int n) {
   return  n<=1?1:n*facto(n-1);
    }
}
