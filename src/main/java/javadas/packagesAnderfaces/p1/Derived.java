package javadas.packagesAnderfaces.p1;

public class Derived extends Protection {

    Derived() {
        System.out.println("кoнcтpyктop подкласса");
        System.out.println("n = " + n);
        //System.out.println("n_pri =" + n_pri);
        System.out.println("n_pro =" + n_pro);
        System.out.println("n_pub =" + n_pub);
    }
}
