package javadas.packagesAnderfaces.Interfaces;

public class IFTest2 {
    public static void main(String[] args) {

        FixedStack mystack1 = new FixedStack(5);
        FixedStack mystack2 =  new FixedStack(8);

        for(int i=0; i<12; i++) {
            mystack1.push(i);
        }
        for(int i=0; i<20; i++) {
            mystack2.push(i);
            System.out.print("Cтeк в mystack1:");
        }
        for(int i=0; i<12; i++) {
            System.out.println(mystack1.рор());
            System.out.print("Cтeк в mystack2:");
        }
        for(int i=0; i<20; i++) {
            System.out.println(mystack2.рор());
        }
    }
}
