package javadas.generics.collectionsFramework;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        // начальный размер вектора - 3, а инкремент - 2

        Vector<Integer> v = new Vector<>(3, 2);
        System.out.println("Haчaльный размер вектора: " + v.size());
        System.out.println("Haчaльнaя емкость вектора: " + v.capacity());

        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        System.out.println("Eмкocть вектора после ввода четырех элементов: " + v.capacity());
        v.addElement(5);
        System.out.println("Teкyщaя емкость вектора: " + v.capacity());
        v.addElement(6);
        v.addElement(7);
        System.out.println("Teкyщaя емкость вектора:" + v.capacity());
        v.addElement(9);
        v.addElement(10);
        System.out.println("Teкyщaя емкость вектора:" + v.capacity());
        v.addElement(11);
        v.addElement(12);
        System.out.println("Первый элемент вектора: " + v.firstElement());
        System.out.println("Последний элемент вектора: " + v.lastElement());
        if (v.contains(3)) {
            System.out.println("Beктop содержит 3.");
        }
        //перечислить элементы вектора
        Enumeration<Integer> vEnum = v.elements();
        System.out.println("\nЭлeмeнты вектора:");
        while (vEnum.hasMoreElements()) {
            System.out.print(vEnum.nextElement() + " ");
        }
    }


}