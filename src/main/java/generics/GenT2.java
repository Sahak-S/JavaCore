package generics;

public class GenT2 extends  GenT<String>{
    GenT2(String o) {
        super(o);
    }

    String getob (){
        System.out.println("Bызвaн метод String getoЬ():");
        return ob;
    }

}
