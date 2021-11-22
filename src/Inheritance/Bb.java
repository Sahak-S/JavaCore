package Inheritance;

public class Bb extends  Aa{

    public Object show;
    int i;

    Bb(int a, int b){

        super.i = a;
        i = b;


    }
    void show(){
        System.out.println("Члeн i в суперклассе: "+ super.i);
        System.out.println("Члeн i в подклассе: " + i);
    }

}
