package Glux7;

public class Outer1 {

    int outer_x = 100;

    void test() {
        Outer1.Inner1 myinner = new Outer1.Inner1();
        myinner.display();
    }

    class Inner1 {
        int y = 10;

        public void display() {
            System.out.println("вывoд: outer_x =" + outer_x);
        }
    }
}
   /* void showy(){
        System.out.println(y);
    }
}*/
