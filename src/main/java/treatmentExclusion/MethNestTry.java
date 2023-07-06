package treatmentExclusion;

public class MethNestTry {

    static void nesttry(int a) {
        try {
            if (a == 1) {
                a = a / (a - a);                     // деление на нуль
            }
            if (a == 2) {
                int c[] = {1};
                c[42] = 99;
            }
        } catch (ArrayIndexOutOfBoundsException е) {
            System.out.println("Индeкc за пределами массива :" + е);
        }
    }

    public static void main(String[] args) {
        try {
            int a = args.length;
            int b = 42 / a;
            System.out.println("a =" + a);
            nesttry(a);
        }catch (ArithmeticException e){
            System.out.println("Дeлeниeнaнyль: " + e);
        }
    }

}
