package javadas.generics;

public class HierDemoЗ {

    public static void main(String[] args) {

        Gener<Integer> iob = new Gener<>(88);
        Gener2<Integer> iob2 = new Gener2<>(99);
        if (iob2 instanceof Gener2<?>){
            System.out.println("Oбъeкт iOb2 является экземпляром класса Gener2");
        }
        if (iob2 instanceof Gener<?>){
            System.out.println("Oбъeкт iOb2 является экземпляром класса Gener");
        }
        System.out.println();
        if (iob instanceof Gener<?>){
            System.out.println("Oбъeкт iOb является экземпляром класса Gener");
        }
        if (iob instanceof Gener2<?>){
            System.out.println("Oбъeкт iOb является экземпляром класса Gener2");
        }

    }
}
