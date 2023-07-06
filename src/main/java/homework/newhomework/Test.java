package homework.newhomework;

public class Test {
    public static void main(String[] args) {

        int[] array = {0, 8, 48, -9, 75, 6, 19};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        System.out.print(max + " ");
        System.out.println();

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min + " ");
        System.out.println();
//-------------------------------------------------------------------------------------------

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }

        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 != 0){
                num++;
            }
        }
        System.out.println(num + " ");


        int num1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] %2 != 0){
                num1++;
            }
        }
        System.out.println( num1 + " ");

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

        int mij = 0;
        for (int i = 0; i < array.length; i++) {
            mij = sum/ array.length;
        }
        System.out.println(mij);

        //====================================================================

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j-1]){
                    int temp  = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }

            }

        }
        System.out.println();
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();




    }
}
