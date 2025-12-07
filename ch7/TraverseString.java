package gr.aueb.cf.cf9.ch7;

public class TraverseString {
    public static void main(String[] args) {
        String s = "Coding Factory";
        String fullName="aueb.txt";
        String extension;
        String s2;
        for (int i=0; i<s.length(); i++) {
            System.out.println(s.substring(i, i+1));
        }
        int index=0;

        index= s.indexOf("o", 2);
        System.out.println(index);

        s2=s.substring(1);
        System.out.println(s2);

        extension=fullName.substring((fullName.indexOf("."))+1);
        System.out.println("The extension is "+extension);

    }
}
