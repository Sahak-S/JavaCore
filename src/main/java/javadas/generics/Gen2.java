package javadas.generics;

public class Gen2 <T, V> extends Geng<T>{
    V ob2;
    Gen2(T o, V o2) {
        super(o);
        ob2 = o2;
    }
    V getob2(){
        return ob2;
    }
}
