package FigurePainter;

public class FigurePainter5 {
    public static void main(String[] args) {
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
}
