package javadas.generics.collectionsFramework;


import java.util.Properties;
import java.util.Set;

public class PropDemo {
    public static void main(String[] args) {

        Properties capitals = new Properties();
        capitals.put("Հայաստան", "Երևան");
        capitals.put("Ռուսաստան", "Մոսկվա");
        capitals.put("Բրազիլիա", "Բրազիլիա");
        capitals.put("Ֆրանսիա", "Փարիզ");
        capitals.put("Վրաստան", "Թբիլիսի");

        // получить множество ключей
        Set<?> states = capitals.keySet();

        // показать все страни и их столицы

        for (Object name : states) {
            System.out.println("Պետության մայրաքաղաքը - " + name + " - " + capitals.getProperty((String) name) + ":");
        }
        System.out.println();

        // найти страниу, отсутствующий в списке,
        // указав значения, выбираемые по умолчанию
        String str = capitals.getProperty("Իտալիա", " ցանկում չկա :");
        System.out.println("Իտալիա Պետության մայրաքաղաքը  - " + str );
    }
}
