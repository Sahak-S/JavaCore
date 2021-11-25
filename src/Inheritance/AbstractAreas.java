package Inheritance;

public class AbstractAreas {

    public static void main(String[] args) {
       // Figure1 f = new Figure1();
        Rectangle1 r = new Rectangle1(5,15);
        Triangle1 t = new Triangle1(10,13);
        Figure1 figure1f;

        figure1f = r;
        System.out.println("Плoщaдь равна•" + figure1f.area());

        figure1f = t;
        System.out.println("Плoщaдь равна•" + figure1f.area());

    }
}
