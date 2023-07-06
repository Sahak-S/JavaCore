package classesofmethods;

public class Overload {

    public static void main(String[] args) {

        OverloadDemo ob = new OverloadDemo();

        double result;

        ob.test();
        ob.test(5);
        ob.test(5,10);
        result = ob.test(123.25);
        System.out.println("կանչի պատասխանը ob.test(123.25) :" + result);
    }

}
