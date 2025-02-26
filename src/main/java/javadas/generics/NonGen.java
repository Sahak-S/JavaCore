package javadas.generics;

public class NonGen {

    Object ob;   //объект оЬ теперь имеет тип Object

    // передать конструктору ссылку на объект типа Object
    NonGen(Object o) {
        ob = o;
    }

    // возвратить тип Object
    Object getob() {
        return ob;
    }

    // показать тип объекта оЬ
    void showType() {
        System.out.println(ob.getClass().getName());
    }

    void showType1() {
        System.out.println(ob.getClass().toString());
    }
}
