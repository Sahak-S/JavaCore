package packagesAnderfaces.p2;

public class Protection2 extends packagesAnderfaces.p1.Protection {

    Protection2() {
        System.out.println("конструктор, унаследованный из другого пакета");

        //System.out.println("n =" + n_pro);         // հասանելի են տվյալ դասի ու պապկի համար
       //System.out.println("n_pri =" + n_pri);      //  հասանելի են տվյալ դասի համար
        System.out.println("n_pro =" + n_pro);
        System.out.println("n_pub =" + n_pub);


    }
}
