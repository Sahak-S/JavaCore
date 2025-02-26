package javadas.generics;

public class GenArrays {

    public static void main(String[] args) {

        Integer [] n = {1,2,3,4,5};
        GenA<Integer> iob = new GenA<>(50,n);
        System.out.println(iob.ob);

        GenA <?> gens [] = new GenA<?>[10];
        System.out.println(gens.length);

    }
}
