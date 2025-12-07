package gr.aueb.cf.cf9.ch6;

public class Copy {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int[] copyArr;

        copyArr=copyMethod(arr);

        for(int i=0; i<=arr.length-1; i++) {
            System.out.println(copyArr[i]);
        }


    }

    public static int[] copyMethod(int[] arr) {
        int[] newArr=new int[arr.length];

        for (int i=0; i<= arr.length-1; i++) {
            newArr[i]=arr[i];
        }
        return newArr;

    }
}
