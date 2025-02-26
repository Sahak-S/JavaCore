package incubator.incubator.it;

public class Array {

    public static void main(String[] args) {

        int[] array = {1, 54, 26, 15, 4, 48, 232, 25, 0, 5, -9};

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
            if (array[i]<min){
                min= array[i];
            }
        }
        System.out.println(" min" + min);
        System.out.println();

        //Տպեք մասիվի բոլոր զույգ էլեմենտները,

        //Տպեք մասիվի բոլոր կենտ էլեմենտները։
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                System.out.println("N " + i + " - Թիվ " + array[i] + " է");
            }

        }
        System.out.println();
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                num++;
            }
        }
        System.out.println("Կենտերի թիվը հավասար է " + num);
    }
}
