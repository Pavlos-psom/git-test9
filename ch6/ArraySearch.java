package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6,7,8,9,10} ;
        int value=0;
        int position=0;

        System.out.println("Please enter a value");
        value=scanner.nextInt();
        position=getPosition1(arr, value);

        if (position==-1) {
            System.out.println("Value not found0");
        } else {
            System.out.println("Value "+value+" was found at position "+(position+1));
        }


    }

    public static int getPosition1(int[] arr, int value) {
        if(arr==null) return -1;
        int positionToReturn = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                positionToReturn = i;
                break;
            }
        }
        return positionToReturn;
    }


    public static int getPosition2(int[] arr, int value) {
        if(arr==null) return -1;


        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
               return -i;
            }
        }
        return -1;
    }
}
