package FigurePainter;

public class FigurePainter3 {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j >i ; j--) {
                System.out.print(" "); // խնդիրը նման է FigurePainter4 մի տարբերությամբ
                                       // այստեղ 1 пробел է

            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
