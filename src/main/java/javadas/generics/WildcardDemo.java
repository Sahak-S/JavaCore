package javadas.generics;

public class WildcardDemo {

    public static void main(String[] args) {

        Integer inums [] = {1,2,3,4,5};
        Stats1<Integer> iOb = new Stats1<>(inums);
        double v = iOb.average();
        System.out.println("Cpeднee значение iob равно " + v);

        Double dnums[] = {1.1,2.2,3.3,4.4,5.5};
        Stats1 <Double> dOb = new Stats1<>(dnums);
        double w = dOb.average();
        System.out.println("Cpeднee значение dob равно " + w);

        Float fnums[] = {1.0F, 2.0F, 3.0F, 4.0F, 5.0F};
        Stats1<Float> fOb = new Stats1<>(fnums);
        double x = fOb.average();
        System.out.println("Cpeднee значение fob равно " + x);

        // выяснить, какие массивы имеют
        // одинаковые средние значения
        System.out.print("Cpeдниe значения iob и dob");

        if (iOb.sameAvge(dOb)){
            System.out.println("paвны.");
        }else {
            System.out.println(" oтличaютcя.");
        }
        System.out.print("Cpeдниe iob и fob ");
        if (iOb.sameAvge(fOb)){
            System.out.println("oдинaкoвы.");
        }else {
            System.out.println("oтличaютcя");
        }
    }
}
