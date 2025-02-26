package javadas.grup.arreyUtil;

public class ArreyUtil {

    void print (int[] array){
        for (int i : array) {
            System.out.print(i + " ");

        }
        System.out.println();
    }
    int max(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }

        }
       return (max);

    }
    int min(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return (min);
    }
    double k (int[] array){
        double k = 0;

        for (int i = 0; i < array.length; i++) {
            k += array[i] / array.length;
        }
        return (k);
    }

    int sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (sum);
    }
    int num(int[] array){
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                num++;
            }
        }
       return (num);
    }

    int num1(int[] array){
        int num1 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 1) {
                num1++;
            }
        }
        return (num1);
    }




}
