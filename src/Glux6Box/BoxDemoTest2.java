package Glux6Box;

public class BoxDemoTest2 {

    public static void main(String[] args) {

        BoxBox mybox1 = new BoxBox();
        BoxBox mybox2 = new BoxBox();
        double vol;

        mybox1.width = 10;
        mybox1.height = 20;
        mybox1.depth = 15;

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;

        vol = mybox1.valium();
        System.out.println(vol);
        vol = mybox2.valium();
        System.out.println(vol);
    }
}
