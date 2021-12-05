package Grup1;

public class Pen {


    String tip = "Gel";
    String color = "blue";
    int print = 10;

    public static boolean clicket = false;

    public void click(int a){
        clicket = true;
    }
    public void unclicet(int a){
        clicket = false;

    }
}
