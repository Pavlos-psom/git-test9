package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

public class QueueApp {

    public  static int[] queue=new int[10];
    public static int top=-1;
    public static int num;
    public static void main(String[] args) {

    enqueue(1);
        enqueue(2);
        enqueue(3);

        enqueue(4);

        enqueue(5);
        enqueue(6);
print();
        System.out.println("**********");
num=dequeue();
        num=dequeue();
        num=dequeue();
        print();
        System.out.println("***********");


    }

    public static void enqueue(int num) {
        if (isFull()) {
            System.out.println("The queue is full");
        }
        queue[++top]=num;
    }

    public static int dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
        }
        num=queue[0];
        queue= Arrays.copyOfRange(queue, 1, queue.length+1);
        top--;
        return num;
    }

    public static boolean isEmpty() {
        return top==-1;
    }

    public static boolean isFull() {
        return top>=queue.length-1;
    }

    public static void print() {
        for (int i=top; i>=0; i++) {
            System.out.println(queue[i]);
        }
    }
}
