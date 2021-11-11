package Glux7;

public class OverloadDemo {

    void test() {
        System.out.println("Կարգաորումը բացակայում է");
    }

    void test(int a) {
        System.out.println("a :" + a );

    }
    void test(int a,int b){
        System.out.println("a և b:" + a + " " + b);
    }
    double test(double a){
        System.out.println("a :" + a);
        return a * a;
    }

}
