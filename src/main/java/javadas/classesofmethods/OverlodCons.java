package javadas.classesofmethods;

public class OverlodCons {

    public static void main(String[] args) {

        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new  Box(7);

        double vol;
        vol = mybox1.volume();
        System.out.println("Объем mybox1 равен " + vol);
        vol = mybox2.volume();
        System.out.println("Объем mybox2 равен " + vol);
        vol = mycube.volume();
        System.out.println("Объем mycobe равен " + vol);

    }
}
