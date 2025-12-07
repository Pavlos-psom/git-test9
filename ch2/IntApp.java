package gr.aueb.cf.cf9.ch2;

public class IntApp {
    public static void main(String[] args) {
        System.out.printf("Type int size: %d bits, min: %d, max: %d%n", Integer.BYTES*8, Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Type  byte: %d bits, min: %d, max: %d%n", Byte.BYTES*8, Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("Type  short: %d bits, min: %d, max: %d%n", Short.BYTES*8, Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("Type  long: %d bits, min: %d, max: %d%n", Long.BYTES*8, Long.MIN_VALUE, Long.MAX_VALUE);

    }
}
