package treatmentExclusion;

public class ThrowsDemo1 {

    static void throwOne() throws IllegalAccessException {
        System.out.println("B теле метода throwOne() .");
        throw new IllegalAccessException("дeмoнcтpaция");
    }

    public static void main(String[] args) {

        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Пepexвaчeнo исключение:" + e);
            e.printStackTrace();
        }
    }
}
