package generics;

public class NonGenDemo {

    public static void main(String[] args) {

        NonGen  iOb;

        iOb = new NonGen(88);

        //показать тип данных, хранящихся в переменной iOb
        iOb.showType();
        iOb.showType1();

        //получить значение переменной iOb. Обратите
        // внимание на то, что для этого не требуется
        // никакого приведения типов

        int v = (Integer) iOb.getob();
        System.out.println(v);

        NonGen strob = new NonGen("java");
        //Gen <String> strob = new Gen<String>("java");
        // показать тип данных, хранящихся в переменной strOb

        strob.showType();
        strob.showType1();
        //получить значение переменной strOb. И в этом
        // случае приведение типов не требуется

        String str = (String) strob.getob();
        System.out.println(str);

    }
}
