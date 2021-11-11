package Glux7;

public class OverlodCons2 {

    public static void main(String[] args) {

        Box1 mybox1 = new Box1(10,20,15);
        Box1 mybox2 = new Box1();
        Box1 mycube = new Box1(7);

        Box1 myclon1 = new Box1(mybox1);
        Box1 myclon2 = new Box1(mybox2);


        double vol;

        vol = mybox1.volume();
        System.out.println("Oбъeм mybox1 равен " + vol);
        vol = mybox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);
        vol = mycube.volume();
        System.out.println("Oбъeм mycube равен " + vol);
        vol = myclon1.volume();
        System.out.println("Oбъeм myclon1 равен " + vol);
        vol = myclon2.volume();
        System.out.println("Oбъeм myclon2 равен " + vol);

    }
}
