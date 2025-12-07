package gr.aueb.cf.cf9.ch7;

public class CharrCount {

    public static void main(String[] args) {
        String s="CodingFactory";
        char ch='o';
        int result;

        result=findChar(s, ch);
        System.out.println(result);
    }

    public static int findChar (String s, char ch) {
        int count=0;

        for (int i=0; i<s.length(); i++) {
            if(s.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}
