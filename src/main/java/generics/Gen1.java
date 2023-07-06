package generics;

public class Gen1 <T>{

    T ob;
    // объявить объект типа т
    //передать конструктору ссылку на объект типа Т
    Gen1 (T o){
        ob = o;
    }

    //возвратить объект оb

    T getob(){
        return ob;
    }
    //показать тип Т
}
