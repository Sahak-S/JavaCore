package grup1;

public class primer1 {
    public static void main(String... atgs) {
        A alpha = new B();
    }
}

class A {
    A(){
        System.out.print("A");
        a();
    }

    void a() {
        System.out.print("a");
    }
}

class B extends A {
    B() {
        System.out.print("B");
        a();
    }

    void a() {
        System.out.print("b");
    }
}
