package generics;

public class SimpGen {

    public static void main(String[] args) {
        TwoGen<Integer,String> tgObj= new TwoGen<>(88,"java");

         // показать типы
        tgObj.showТypes();

        // Получить и показать значения

        int v = tgObj.getob1();
        System.out.println(v);

        String str = tgObj.getob2();
        System.out.println(str);
    }
}