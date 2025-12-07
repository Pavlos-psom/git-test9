package gr.aueb.cf.cf9.ch7;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Long timeStart=0l;
        Long timeEnd=0l;

        timeStart=System.currentTimeMillis();
        for (int i=0; i<150000; i++) {
            sb.append(i);
        }
        timeEnd=System.currentTimeMillis();
        System.out.println((timeEnd-timeStart)/1000.0);

    }
}
