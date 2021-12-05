package Grup1;

public class massiv {

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 9};
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i] +" ");
        }
        System.out.println();

        for (int i = 0; i < a.length; i--) {

            a[i] = a[i - 1];

            a[3] = 4;



            for (int val : a) System.out.print(val + " ");

        }

    }
}
