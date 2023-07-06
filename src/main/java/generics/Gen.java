package generics;

public class Gen <T>{

    T ob;
    // объявить объект типа т
    //передать конструктору ссылку на объект типа Т
    Gen (T o){
        ob = o;
    }

    //возвратить объект оb

    T getob(){
        return ob;
    }
    //показать тип Т

    void  showType(){
        System.out.println(ob.getClass().getName());
    }
    void  showType1(){
        System.out.println(ob.getClass().toString());
    }






}
