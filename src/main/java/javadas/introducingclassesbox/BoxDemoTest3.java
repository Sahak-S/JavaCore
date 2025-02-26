package javadas.introducingclassesbox;

public class BoxDemoTest3 {

    public static void main(String[] args) {
        BoxB mybox1 = new BoxB();
        BoxB mybox2 = new BoxB();
        double vol;

        mybox1.setDim(110,20,15);
        mybox2.setDim(3,6,9);

        vol = mybox1.valium();
        System.out.println(vol);
        vol = mybox2.valium();
        System.out.println(vol);

    }
}
