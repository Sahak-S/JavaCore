package javadas.inheritance;

public class DemoBoxWeight {

    public static void main(String[] args) {

        BoxWeight mybox1 = new BoxWeight(10,20,30,45.2);
        BoxWeight mybox2 = new BoxWeight(2,4,6,8.26);
        double vol;

        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 раве :" + vol);
        System.out.println("Вес mybox1 равен :" + mybox1.weight);
        System.out.println();

        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен:" + vol);
        System.out.println("Вес mybox2 равен :" + mybox2.weight);
    }
}
