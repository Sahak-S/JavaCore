package javadas.generics;

public class BoundedWildcard {

    static void showXY(Coords<?> c) {
        System.out.println("Koopдинaты Х У:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + " " + c.coords[i].y);
            System.out.println();
        }
    }

    static void showXYZ(Coords<? extends ThreeD> c) {
        System.out.println("Koopдинaты Х У Z:");
        for (int i = 0; i < c.coords.length; i++)
            System.out.println(c.coords[i].x + c.coords[i].y + c.coords[i].z);
        System.out.println();
    }

    static void showAll(Coords<? extends FourD> c) {
        System.out.println("Koopдинaты Х У Z Т:");
        for (int i = 0; i < c.coords.length; i++) {
            System.out.println(c.coords[i].x + c.coords[i].y + c.coords[i].z + c.coords[i].t);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        TwoD[] td = {new TwoD(0, 1), new TwoD(5, 9),
                new TwoD(12, 8), new TwoD(-12, -5)};

        Coords<TwoD> tdlocs = new Coords<>(td);
        System.out.println("Coдepжимoe объекта tdlocs.");
        showXY(tdlocs);
        // showXYZ(tdlocs);   // Ошибка
        // showAll(tdlocs);   // Ошибка

        // а теперь создать несколько объектов типа FourD

        FourD[] fd = {new FourD(1, 2, 3, 4), new FourD(21, 13, 5, 6),
                new FourD(12, 20, 0, 68), new FourD(-12, -23, 2, -5)};

        Coords<FourD> fblocs = new Coords<>(fd);
        System.out.println("Coдepжимoe объекта fdlocs.");
        showXY(fblocs);
        showXYZ(fblocs);
        showAll(fblocs);
    }
}
