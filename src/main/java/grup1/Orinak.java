package grup1;

public class Orinak {
    public static void main(String[] args) {

        int[] array = {5, 2, 5, 6, 8, 9, 1, 8, 7, 5};

        int sum = 0;
        for (int i = 0; i < array.length; i++) {/////////////////////////56
            sum += array[i];

        }
        System.out.print(sum + " ");    ////////////////     56

        int t = 0;
        for (int i = 0; i < array.length; i++) {
            t = sum / array.length;

        }
        System.out.print("t =" + t);
        System.out.println();     //////////////////////////                      5

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];

            }


        }
        System.out.print(min);
        System.out.println();/////////////////////                1
///////////////////////////////////////////
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.println(max);  ///////////    9

        ///////////////////////////////


        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {

                System.out.print(" ");
                System.out.print(array[i]);

            }

        }

        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 1) {
                k++;

            }

        }
        System.out.print(k);

        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                n++;

            }

        }
        System.out.print(n);
        System.out.println();

        int p= 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                p++;
            }

        }
        System.out.println(p);
    }
}

