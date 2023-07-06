package treatmentExclusion;

public class NestTry {

    public static void main(String[] args) {

        try {
            int a = args.length;
            int b = 42 / 0;
            System.out.println("a = " + a);

            try {
                if (a == 1){
                    a = a / (a - a);                     // деление на нуль
                }
                if (a == 2){
                    int c [] = {1};
                    c[42] = 99;
                }
            }catch (ArrayIndexOutOfBoundsException е){
                System.out.println("Индeкc за пределами массива :" + е);
            }
        }catch (ArithmeticException e){
            System.out.println("Дeлeниe на нуль : " + e);
        }
    }
}
