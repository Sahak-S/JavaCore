package grup1.error.test;

import classesofmethods.Test;

import java.util.Formatter;

public class Testt {

    {
        System.out.println("Block");
    }
    int x = getX();

    static {
        System.out.println("Static block");
    }

    public int getX() {
        System.out.println("X variable");
        return 5;
    }

    static int y = getY();
    public static int getY() {
        System.out.println("Y variable");
        return 6;
    }


    public static void main(String[] args) {
        Testt m = new Testt();


        //////////////

        /////////////

        Double d1 = 1d;
        Double d2 = 1d;
        System.out.println(d1 == d2);

        /////////////////////////

        int x = 0;
        int y = 10;
        do {
            y--;
            ++x;
        } while (x < 5);
        System.out.print(x + "," + y);
        System.out.println();

        ////////////////////////////////

        outer:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Hello");
                continue outer;
            }
            System.out.println("outer");
        }
        System.out.println("Good-Bye");

        ////////////////////////////////
        A a = new B();
        a.b();



    }
}

class A {
    void a() {
        System.out.println("A-a");
    }

    void b() {
        System.out.println("A-b");
        a();
    }
}

class B extends A {
    void a() {
        System.out.println("B-a");
    }

    void b() {
        System.out.println("B-b");
        super.b();
    }
}

