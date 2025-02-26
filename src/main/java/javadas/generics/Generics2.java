package javadas.generics;

public class Generics2 <T> extends Generics<T>{
    Generics2(T o) {
        super(o);
    }
    T getob(){
        System.out.print("Meтoд getob() из класса Generics2:");
        return ob;
    }
}
