package homework.bracechecker;

public class Stack {
    private int[] array = new int[10];
    private int index;

    public Stack() {

        index = -1;
    }
    Stack (int lengkt){
        array = new int[lengkt];
        int index = -1;
    }

    public void push(int value) {
        if (index == array.length) {
            System.out.println("stack-ը վերջացավ");
        } else {
            array[++index] = value;
        }
    }

    public int pop() {
        if (index < 0) {
            System.out.println("stack-ը դատարկ է");
            return 0;
        } else {
            return array[index--];
        }
    }
    public boolean isEmpty(){
        return index == -1;
    }

}
