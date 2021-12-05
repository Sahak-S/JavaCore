package newhomework;

public class ArrayUtil {

    public static void main(String[] args) {

        int[] array = {1, 54, 26, 15, 4, 48, 232, 25, 0, 5};

        //Տպեք մասիվի բոլոր էլեմենտները

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        //Տպեք մասիվի ամենամեծ թիվը
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
        System.out.print("max =" + max);
        System.out.println();
        //Տպեք մասիվի ամենափոքրը թիվը,
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        System.out.print("min =" + min);
        System.out.println();

        //Տպեք մասիվի բոլոր զույգ էլեմենտները,
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(" N " + i + " - Թիվ " + array[i] + " է");

            }
        }
        System.out.println();

        //Տպեք մասիվի բոլոր կենտ էլեմենտները։
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println("N " + i + " - Թիվ " + array[i] + " է");
            }

        }
        System.out.println();

        //Տպեք կենտերի քանակը
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                num++;
            }
        }
        System.out.println("Կենտերի թիվը հավասար է " + num);


        //Տպեք զույգերի քանակը։

        int num1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 1) {
                num++;
            }

        }
        System.out.println("Զույգերի թիվը հավասար է " + num1);

        //Տպեք մասիվի էլեմենտների գումարը։

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Ստրինգի թվերի գումարն հավասար է " + sum);

        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
        int mij = 0;
        for (int i = 0; i < array.length; i++) {
            mij = sum/array.length;
        }
        System.out.println("Միջին թվաբանականը հավասար է =" + mij);

        // Միջին արժեքը:
        double k = 0;
        for (int i = 0; i < array.length; i++) {
            k += array[i] / array.length;
        }
        System.out.println("Միջին արժեքը հավասար է " + k);

    }
}
