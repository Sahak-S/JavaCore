package newhomework;

public class CharArray {

    public static void main(String[] args) {

        //տվյալ մասիվը պետք է դասավորել մինիմումից մակսիմում
        int[] array = {7, 12, 54, 0, -4, 44, 17, 88, 4};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < array.length; j++) {
                if (array[j] < array[j-1]) {
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }

            }

        }
        System.out.println();
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");

        }


    }
}
