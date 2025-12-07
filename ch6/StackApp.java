package gr.aueb.cf.cf9.ch6;

public class StackApp {
    public static int[] stack=new int[10];
    public static int top=-1;
    public static int num;

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
        push(5);
        push(6);

        print();
        System.out.println("***************");
        pop();
        pop();
        pop();
        print();
        System.out.println("***************");

        push(10);
        push(7);
        push(19);
        print();
        System.out.println("***************");
        pop();
        pop();
        print();
        System.out.println("***************");

    }

    public static void push(int num) {
        if (top>stack.length-1) {
            System.out.println("The stack is full");
        }
        stack[++top]=num;
    }

    public static void pop() {
        int num=0;
        if (top<0) {
            System.out.println("The stack is empty");
        }
        num=stack[top--];

    }

    public static void print() {
        for(int i=top; i>=0; i--) {
            System.out.println(stack[i]);
        }
    }



}
