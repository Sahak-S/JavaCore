package generics.collectionsFramework;

import java.util.LinkedList;

public class MailList {

    public static void main(String[] args) {

        LinkedList<Address> m1 = new LinkedList<>();

        m1.add(new Address("Poxos","Haxtanakac","Gyumry","HH","4203377"));
        m1.add(new Address("Petros","Haxtanakac","Gyumry","HH","4203377"));
        m1.add(new Address("Aram","Haxtanakac","Gyumry","HH","4203377"));

        for (Address element : m1) {
            System.out.println(element);
        }

    }
}
