package javadas.generics;

public class Gener <T>{

    T ob;
    // объявить объект типа т
    //передать конструктору ссылку на объект типа Т
    Gener (T o){
        ob = o;
    }

    //возвратить объект оb

    T getob(){
        return ob;
    }
}
