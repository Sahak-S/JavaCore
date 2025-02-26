package javadas.generics;

public class GenT <T> {

    T ob;

    GenT(T o) {
        ob =o;
    }

    T getOb(){
        return  ob;
    }
}
