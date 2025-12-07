package gr.aueb.cf.cf9.ch4;

public class SumMulApp {
    public static void main(String[] args) {
        int sum=0;
        int mul=1;
        for (int i =1; i<=10; i++) {
            sum=sum+i;
            mul=mul*i;
        }
        System.out.println("The sum is "+sum+" and the mul is "+mul);
    }

}
