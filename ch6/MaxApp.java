package gr.aueb.cf.cf9.ch6;

public class MaxApp {

    public static int[] arr={7, 12, 9, 5, 14, 28, 6};
    public static int maxPos;

    public static void main(String[] args) {
        maxPos=findMaxPos(arr);
        System.out.println("The max position is "+maxPos);
    }

    public static int findMaxPos(int[] arr) {
        int maxNum=0;
        int maxPosition=0;

        for (int i=0; i<=arr.length-1; i++) {
            if (arr[i] >= maxNum) {
                maxNum=arr[i];
                maxPosition=i;
            }
        }
        return maxPosition;
    }
}
