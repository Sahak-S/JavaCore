package generics;

public class Generics <T>{
    T ob;
    Generics(T o){
        ob = o;
    }
    T getob(){
        System.out.print("Meтoд getob() из класса Generics:");
        return ob;
    }
}
