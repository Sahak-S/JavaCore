package javadas.generics;

public class GenDemo {

    public static void main(String[] args) {

        Gen <Integer> iOb;

        iOb = new Gen<Integer>(88);

        //показать тип данных, хранящихся в переменной iOb
        iOb.showType();
        iOb.showType1();

        //получить значение переменной iOb. Обратите
        // внимание на то, что для этого не требуется
        // никакого приведения типов

        int v = iOb.getob();
        System.out.println(v);

        Gen <String> strob = new Gen<>("java");
        //Gen <String> strob = new Gen<String>("java");
        // показать тип данных, хранящихся в переменной strOb

        strob.showType();
        strob.showType1();
        //получить значение переменной strOb. И в этом
        // случае приведение типов не требуется

        String str = strob.getob();
        System.out.println(str);
    }
}
