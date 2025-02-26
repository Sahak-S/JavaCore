package javadas.packagesAnderfaces.p2;

import javadas.packagesAnderfaces.p1.Protection;

public class OtherPackage {

    OtherPackage(){

        Protection p = new Protection();
        System.out.println("кoнcтpyктop из другого пакета");
        //System.out.println("n = " + p.n);            // հասանելի են տվյալ դասի ու պապկի համար
        //System.out.println("n_pri =" + p.n_pri);       //  հասանելի են տվյալ դասի համար
        //System.out.println("n_pro =" + p.n_pro);       // հասանելի է միայն այս դասի համար,
        System.out.println("n_pub =" + p.n_pub);
    }
}
