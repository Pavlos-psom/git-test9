package gr.aueb.cf.cf9.ch6;

public class findElement {
    public static int[] arr={9, 5, 14, 89, 2, 78, 6, 10};
    public static int minEl;

    public static void main(String[] args) {
        minEl=findPosition(arr, 2);
        System.out.println("The position of 2 is "+minEl);
    }

    public static int findPosition(int[] arr, int el) {
        int pos=0;
        for (int i=0; i<=arr.length-1; i++) {
            if (arr[i]==el) {
                pos=i;
                break;
            }
        }
        return pos;
    }
}

