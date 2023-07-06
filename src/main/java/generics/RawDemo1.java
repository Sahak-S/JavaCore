package generics;

public class RawDemo1 {

    public static void main(String[] args) {

        Gen1<Integer> iob = new Gen1<Integer>(88);
        Gen1<String> strob = new Gen1<String>("java");
        Gen1 raw = new Gen1(new Double(98.5));
        double d = (Double) raw.getob();
        System.out.println("Знaчeниe:" + d);

    }
}
