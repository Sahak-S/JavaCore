package classesofmethods;

public class Recursion2 {

    public static void main(String[] args) {

        Recтest ob = new Recтest(10);
        int i;
        for ( i = 0; i < 10; i++) {
            ob.values[i] = i;
        }
        ob.printArray(10);


    }
}
