package Glux6Box;

public class StackTest1 {

    public static void main(String[] args) {
        Stack mystack = new Stack();
        mystack.push(45);
        mystack.push(55);
        mystack.push(65);
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
        System.out.println(mystack.pop());
    }
}
