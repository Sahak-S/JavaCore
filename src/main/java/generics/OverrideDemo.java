package generics;

public class OverrideDemo {

    public static void main(String[] args) {

        Generics<Integer> iob = new Generics<>(88);
        Generics2<Integer> iob2 = new Generics2<>(99);
        Generics<String> strob2 = new Generics2<>("Тест обобщений");
        System.out.println(iob.getob());
        System.out.println(iob2.getob());
        System.out.println(strob2.getob());
    }
}
