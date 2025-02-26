package javadas.homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();
        for (int i = 0; i < 10; i++) {
            da.add(i + 1);
        }
        da.print();
        System.out.println();
        da.delete(4);
        da.print();
        System.out.println();
        da.add(100, 5);
        da.print();
        System.out.println();

      /*  da.print();
        da.delete(4);
        System.out.println();
        da.print();

        da.add(6,5);
        System.out.println();
*/

        int[] numbers = {11, 22, 33, 44};
        da.add(numbers);
        da.print();
        System.out.println();
        System.out.println(da.isExist(0));
        System.out.println(da.isEmpty());
    }
}
