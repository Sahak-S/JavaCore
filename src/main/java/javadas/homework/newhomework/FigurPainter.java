package javadas.homework.newhomework;

public class FigurPainter {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            for (int j = 5; j > i + 1 ; j--) {
                System.out.print("* ");

            }
            System.out.println(" ");

        }
        for (int i = 0; i < 4 ; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }
        for (int i = 0; i < 4 ; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("  ");

            }
            for (int j = 0; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println();


        }
        System.out.println();

        for (int i = 4; i >=0 ; i--) {
            for (int j = 0; j < 4-1; j++) {
                System.out.print(" ");
            }
            for (int j = 4-i; j < 4; j++) {
                System.out.print("* ");

            }
            System.out.println();

        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();
        }

        
        for (int i = 0; i < 4 ; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 3; j >i ; j--) {
                System.out.print(" *");

            }

            System.out.println();
        }


    }
}


