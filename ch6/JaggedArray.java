package gr.aueb.cf.cf9.ch6;

public class JaggedArray {

    public static void main(String[] args) {
        int[][] arr = new int[3][];

        arr[0]=new int[3];
        arr[1]=new int[5];
        arr[2]=new int[10];

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("************");

        for (int[] subArr: arr) {
            for (int el: subArr) {
                System.out.print(el);
            }
            System.out.println();
        }
    }
}
