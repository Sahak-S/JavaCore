package Glux7;

public class Outer0 {

    int outer_x = 100;
    void  test(){
        for (int i = 0; i < 10; i++) {
            class Inner0{
                void display(){
                    System.out.println("вывод: outer_x =" + outer_x);
                }
            }
            Inner0 myiner0 = new Inner0();
            myiner0.display();

        }
    }
}
