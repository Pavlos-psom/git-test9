package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

public class GetMaxPosition {
    public static void main(String[] args) {
        int[] arr= {8, 18, 99,34,3, 9};
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter 5 numbers");
        int maxPos=0;
         maxPos=maxPositionArr(arr);
        System.out.println("Max pos = "+maxPos);
    }

    public static int maxPositionArr(int[] arr) {
        int max=0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int getMaxPosition (int[] arr) {
        int maxValue=Integer.MIN_VALUE;
        int maxPosition=0;

        for (int i=0; i<arr.length; i++) {
            if (arr[i]>maxValue) {
                maxValue=arr[i];
                maxPosition=i;
            }
        }
        return maxPosition;
    }
}
