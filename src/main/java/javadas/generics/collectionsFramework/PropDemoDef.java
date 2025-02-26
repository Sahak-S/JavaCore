package javadas.generics.collectionsFramework;

import java.util.Properties;
import java.util.Set;

public class PropDemoDef {
    public static void main(String[] args) {

        Properties defList = new Properties();

        defList.put("Իտալիա","Հռոմ");
        defList.put("ԱՄՆ","Վաշինկտոն");
        Properties capitals = new Properties(defList);
        capitals.put("Հայաստան", "Երևան");
        capitals.put("Ռուսաստան", "Մոսկվա");
        capitals.put("Բրազիլիա", "Բրազիլիա");
        capitals.put("Ֆրանսիա", "Փարիզ");
        capitals.put("Վրաստան", "Թբիլիսի");

        //получить множество ключей

        Set<?> states = capitals.keySet();

        // показать все страни и их столицы


        for (Object name : states) {
            System.out.println("Պետության մայրաքաղաքը - " + name + " - " + capitals.getProperty((String) name) + ":");
        }
        System.out.println();

        //Теперь страна Италиия будет найден
        // в списке по умолчанию

        String str = capitals.getProperty("Իտալիա");
        System.out.println("Պետության մայրաքաղաքը  - " + str + " - Հռոմ");
    }
}
