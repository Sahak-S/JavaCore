package inheritance;

public class FindAreas {

    public static void main(String[] args) {

        Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(5,10);
        Triangle t = new Triangle(15,17);

        Figure figuref;

        figuref = f;
        System.out.println("Плoщaдь равна" + figuref.area());
        figuref = r;
        System.out.println("Плoщaдь равна" + figuref.area());
        figuref = t;
        System.out.println("Плoщaдь равна" + figuref.area());

    }
}
