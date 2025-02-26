package javadas.packagesAnderfaces.p2;

import javadas.packagesAnderfaces.p1.Protection;

public class Protection2 extends Protection {

    Protection2() {
        System.out.println("конструктор, унаследованный из другого пакета");

        //System.out.println("n =" + n_pro);         // հասանելի են տվյալ դասի ու պապկի համար
       //System.out.println("n_pri =" + n_pri);      //  հասանելի են տվյալ դասի համար
        System.out.println("n_pro =" + n_pro);
        System.out.println("n_pub =" + n_pub);


    }
}
