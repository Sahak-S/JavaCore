package Inheritance;

public class DemoShipment {

    public static void main(String[] args) {

        Shiprnent shiprnent1 = new Shiprnent(10,20,15,10,3.41);
        Shiprnent shiprnent2 = new Shiprnent(2,3,4,0.76,1.28);

        double vol;

        vol = shiprnent1.voliume();
        System.out.println("Oбъeм shipmentl равен :" + vol);
        System.out.println("Bec shipmentl равен :" + shiprnent1.weight);
        System.out.println("Cтoимocть доставки: $ " + shiprnent1.cost);
        System.out.println();

        vol = shiprnent2.voliume();
        System.out.println("Oбъeм shipment2 равен :" + vol);
        System.out.println("Bec shipment2 равен :" + shiprnent2.weight);
        System.out.println("Cтoимocть доставки: $ " + shiprnent2.cost);



    }
}
