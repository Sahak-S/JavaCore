package array;

public class ArrayTest {
    public static void main(String[] args) {

        int[] a = {2,65,8,0,-12};
        for (int i : a) {
            System.out.print(i + " ");
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 1; j < a.length; j++) {
                if (a[j] < a[j-1]){
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j- 1] = temp;
                }
            }
        }
        System.out.println();
        for (int j = 0; j < a.length; j++) {
            System.out.print(a[j] + " ");
        }
    }
}
