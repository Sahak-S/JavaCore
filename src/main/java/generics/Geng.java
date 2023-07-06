package generics;

public class Geng <T>{
    T ob;
    // объявить объект типа т
    //передать конструктору ссылку на объект типа Т
    Geng(T o){
        ob = o;
    }

    //возвратить объект оb

    T getob(){
        return ob;
    }
}
