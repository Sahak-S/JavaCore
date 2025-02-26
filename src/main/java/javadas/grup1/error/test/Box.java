package javadas.grup1.error.test;

public class Box {
    String s = null;

    Box(String str) {
        this.s = str;
    }
}

class MyTest {
    public static void main(String[] args) {
        Box v1 = new Box("abc");
        Box v2 = new Box("abc");

        System.out.println((v1 == v2) + " " + v1.equals(v2));
        for (int i = 0; i <= 10; i++) {
            if (i > 6) break;
            System.out.print(i);
        }
        System.out.println();


        int myInt = 0;
        float myFloat = 0;
        try {
            float result = myFloat / myFloat;
        } catch (RuntimeException re) {
            System.out.println("Exception 1");
        }

        try {
            float result = myFloat / myInt;
        } catch (RuntimeException re) {
            System.out.println("Exception 2");
        }

        try {
            float result = myInt / myFloat;
        } catch (RuntimeException re) {
            System.out.println("Exception 3");
        }

        try {
            float result = myInt / myInt;
        } catch (RuntimeException re) {
            System.out.println("Exception 4");
        }
        System.out.println();

        big_loop:
        for (int i = 0; i < 3; i++) {
            try {
                for (int j = 0; j < 3; j++) {
                    if (i == j) continue;
                    else if (i > j) continue big_loop;
                    System.out.print("A");
                }
            } finally {
                System.out.print("B");
            }
            System.out.print("C");
        }
        System.out.println();

    }

}


