package Grup1;

public class ArreyExample {
    public static void main(String[] args) {

        int[] array = {6, 2, 6, 9, 8, 0, 4, 8,};

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length-1; j++) {
                if (array[i] == array[j+1]) {
                    System.out.println(array[i] + "կրկնվում է");
                    break;
                }
            }

        }

        boolean x;
        x = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                x=false;
                break;

            }
        }
        System.out.println( x);

        double a,b , c, d = 0;
        a = 10.12;
        b = 2;

        a%= 10.12;
        System.out.println(a);








    }
}