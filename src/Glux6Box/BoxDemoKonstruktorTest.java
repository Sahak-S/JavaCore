package Glux6Box;

public class BoxDemoKonstruktorTest {

    public static void main(String[] args) {

        BoxKonstruktor mybox1 = new BoxKonstruktor();
        BoxKonstruktor mybox2 = new BoxKonstruktor();

        double vol;

        vol = mybox1.valium();
        System.out.println(vol);
        vol = mybox2.valium();
        System.out.println(vol);


    }
}
