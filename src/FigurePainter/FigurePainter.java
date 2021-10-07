package FigurePainter;

public class FigurePainter {

    public static void main(String[] args) {
        int i , j ;
        // i , j տողերի և սյուների ն նշանակություւն է,որոնց տրված է արժեքներ կաղված խնդրից
        for ( i = 0; i < 4; i++) {
            for ( j = 0; j<i+1 ; j++) {
                System.out.print(" *");

            }
            System.out.println( );
        }
    }
}
