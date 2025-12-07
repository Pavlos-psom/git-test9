package gr.aueb.cf.cf9.ch6;

public class SecondMinApp {
    public static int[] arr={7, 12, 9, 5, 14, 28, 6};
    public static int secondMinVal;

    public static void main(String[] args) {
        secondMinVal=getSecondMin(arr);
        System.out.println("The second minumum is "+secondMinVal);
    }

    public static int getMin(int[] arr) {
        int minNum=Integer.MAX_VALUE;
        int minPosition=0;

        for (int i=0; i<=arr.length-1; i++) {
            if (arr[i] <= minNum) {
                minNum=arr[i];
                minPosition=i;
            }
        }
        return minPosition;
    }

    public static int  getSecondMin (int[] arr) {

        int minPosition=getMin(arr);
        int  secondMinNum=Integer.MAX_VALUE;

        for(int i=0; i<=arr.length-1; i++) {
            if (i==minPosition) {
                continue;
            }
            if(arr[i]<secondMinNum) {
                secondMinNum=arr[i];
            }
        }
        return secondMinNum;
    }
}
