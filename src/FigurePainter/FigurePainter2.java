package FigurePainter;

public class FigurePainter2 {

    public static void main(String[] args) {
        int i, j;
        for (i = 0; i < 5; i++) {
            for (j = 5; j> i + 1; j--) {

                System.out.print(" *");

            }
            System.out.println();
        }
    }
}