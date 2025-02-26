package javadas.introducingclassesbox;

public class BoxKTest1 {

    public static void main(String[] args) {
        BoxK1 mybox1 = new BoxK1(10,20,15);
        BoxK1 mybox2 = new BoxK1(3,6,9);
        double vol;
        vol = mybox1.volium();
        System.out.println(vol);
        vol = mybox2.volium();
        System.out.println(vol);



    }
}
