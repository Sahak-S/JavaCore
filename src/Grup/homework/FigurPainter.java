package Grup.homework;

public class FigurPainter {

    void FigurPainter1(int count,char c) {

        for (int i = 0; i < count; i++) {
            for (int  j = 0; j<i+1 ; j++) {
                System.out.print(c + "* ");

            }
            System.out.println( );
        }
    }

    void FigurPainter2(int count,char c1){
        for (int i = 0; i < count; i++) {
            for (int j = count; j> i + 1; j--) {

                System.out.print(c1 + "<*");

            }
            System.out.println( );
        }
    }

    void FigurPainter3(){
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j >i ; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

    }
    void FigurPainter4(){

        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i ; j--) {
                System.out.print("  ");

            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }

    void FigurPainter5(){
        for (int i = 4; i >=0 ; i--) {
            for (int j = 0; j < 4-i; j++) {
                System.out.print("  ");

            }
            for (int j = 4-i; j <4 ; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    void FigurPainter6(){
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j > i ; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <=i; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(" ");

            }
            for (int j = 3; j >i ; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
