package javadas.inheritance;

public class Dispatch {

    public static void main(String[] args) {

        NewA newA = new NewA();
        NewB newB = new NewB();
        NewC newC = new NewC();


        NewA  r ;

        r = newA;
        r.callme();

        r = newB;
        r.callme();

        r = newC;
        r.callme();


    }
}
