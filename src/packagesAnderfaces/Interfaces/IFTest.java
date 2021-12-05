package packagesAnderfaces.Interfaces;

public class IFTest {
    public static void main(String[] args) {
        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 =  new FixedStack(8);
        FixedStack mystack3 = new FixedStack(3);

        for(int i=0; i<5; i++) {
            mystack1.push(i);
        }
        for(int i=0; i<8; i++) {
            mystack2.push(i);
            System.out.println("Cтeк в mystack1:");
        }
        for(int i=0; i<12; i++) {
            System.out.println(mystack1.рор());
            System.out.println("Cтeк в mystack2:");
        }
        for(int i=0; i<20; i++) {
            System.out.println(mystack2.рор());
        }

    }
}
