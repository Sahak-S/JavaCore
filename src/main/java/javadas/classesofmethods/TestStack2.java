package javadas.classesofmethods;

public class TestStack2 {
    public static void main(String[] args) {

        Stack1 myStack1 = new Stack1(5);
        Stack1 myStack2 = new Stack1(8);

        for (int i = 0; i < 5; i++) myStack1.push(5);

        for (int j = 0; j < 8; j++) myStack2.push(8);

        System.out.println("Cтeк в mystack1:");
        for(int i=0; i<5; i++) {
            System.out.print(myStack1.pop());
            System.out.println();
        }
        System. out .println ("Стек в mystack2: ");
        for(int i=0; i<8; i++) {
            System.out.print(myStack2.pop());
        }
    }
}
