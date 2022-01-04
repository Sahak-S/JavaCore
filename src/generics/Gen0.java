package generics;

public class Gen0<T> extends NonGen1 {
    T ob;

    Gen0(T o, int i) {
        super(i);
        ob = o;
    }

    T getOb(){
        return ob;
    }
}
