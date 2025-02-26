package javadas.generics.collectionsFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashМapDerno {

    public static void main(String[] args) {

        HashMap<String,Double> hm = new HashMap<>();
        hm.put("Poxox Poxosyan",new Double(123.14));
        hm.put("David Poxosyan",new Double(-458.14));
        hm.put("Aram Poxosyan",new Double(589.14));
        hm.put("Poxox Petrosyan",new Double(0.125));
        hm.put("Mkrtich  Petrosyan",new Double(-19.0));
        System.out.println(hm);

        //получить множество записей

        Set<Map.Entry<String, Double>> set = hm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + " : ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // внести сумму 1000 на счет David Poxosyan

        double balance = hm.get("David Poxosyan");
        hm.put("David Poxosyan",balance + 1000);
        System.out.println(hm);
    }
}
