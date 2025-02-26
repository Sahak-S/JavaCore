package javadas.array;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] array = {0, 6, 14, -4, 2, 1, 3, 10};

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.print(array[i] + ",");

            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println();

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 1) {
                count++;

            }
        }
        System.out.println(count );


        int count1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count1++;

            }
        }
        System.out.println(count1);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

        int m = 0;
        for (int i = 0; i < array.length; i++) {
            m = sum / array.length;
        }
        System.out.println(m);

        // Միջին արժեքը:
        double k = 0;
        for (int i = 0; i < array.length; i++) {
            k += array[i] / array.length;
        }
        System.out.println("Միջին արժեքը հավասար է " + k);

        int uone = array[0];
        int tue = array[0];

        for (int l : array) {
            System.out.print(l + " ");
        }

        for (int i = 0; i < array.length; i++) {
//            if (array[i] > uone) {
//                tue = uone;
//                uone = array[i];
//            } else
                if (array[i] > tue && array[i] != uone) {
                tue = array[i];
            }

        }
        System.out.println();
        System.out.print(tue + " ");


    }




}
