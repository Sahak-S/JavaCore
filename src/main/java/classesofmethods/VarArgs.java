package classesofmethods;

public class VarArgs {

    static void voTest(int ... v){
        System.out.print("Koличecтвo аргументов: " + v.length + " Содержимое: ");

        for (int x : v) {
            System.out.print(x + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        voTest(10);
        voTest(1,2,3);
        voTest();
    }
}
