package Homework;

public class Arrayutil {

    public static void main(String[] args) {

        int[] array = {1, 3, 7, 19, 25, 34, 77, 111, 155, 200};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " " );

        }
        // min արժեքը
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println();
        System.out.println("min = " + min);

        // max արժեքը
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.print("max = " + max);
        System.out.println();

        // Միջին արժեքը
        double k = 0;

        for (int i = 0; i < array.length; i++) {
            k += array[i] / array.length;
        }
        System.out.println( "Միջին արժեքը հավասար է " +  k);

        // Ստրինգի  թվերի գումարը
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }

        System.out.println("Ստրինգի թվերի գումարն հավասար է " + sum);
        int z = 632;
        int x;
        x = z / array.length;
        System.out.println("Միջին թվաբանականը հավասար է =" + x);


        // Զույգ թվերը
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(" N " + i + " - Թիվ " + array[i] +" է");

            }
        }

        // Կենտ Թվերը

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {

                System.out.println("N " + i + " - Թիվ " + array[i] + " է");
            }
        }

        // Զույգ թվի քանակը

        int a = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 1) {
                a++;
            }
        }
        System.out.println("Զույգերի թիվը հավասար է " + a);

            //Կենտ թվի քանակը

        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                num++;
            }
        }
        System.out.println("Կենտերի թիվը հավասար է " + num
        );
    }
}
