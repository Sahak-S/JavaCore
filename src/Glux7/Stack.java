package Glux7;

public class Stack {

    private int[] stack = new int[10];
    private int tos;

    public Stack() {
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("stack-ը վերջացավ");
        } else {
            stack[++tos] = item;
        }
    }

    int pop() {
        if (tos < 0) {
            System.out.println("stack-ը դատարկ է");
            return 0;
        } else {
            return stack[tos--];
        }
    }


}
