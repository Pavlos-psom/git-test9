package gr.aueb.cf.cf9.ch6;

public class GetEven {
    public static void main(String[] args) {
        int[] arr= {8, 18, 99,34,3, 9, 4, 48, 31};
        //Scanner scanner = new Scanner(System.in);
        //System.out.println("Please enter 5 numbers");
        int[] newArr;
        newArr=evenMethod(arr);
        for (int i=0; i<newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }

    public static int[] evenMethod(int[] arr) {
        int tmp=0;
        int tmp2=0;
        for (int i=0; i<arr.length; i++) {
            if (arr[i]%2==0) {
                tmp++;
            }
        }
        int[] tmpArr=new int [tmp];
        //
        for (int j=0; j<arr.length; j++) {
            if (arr[j]%2==0) {

            tmp++;
            tmpArr[tmp-1]=arr[j];
            }
        }
        return tmpArr;
    }
}
