package Homework.dynamicArray;

public class DynamicArrayTest {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();
        for (int i = 1; i <110; i++) {
            da.add(i);
        }
        int byIndex = da.getByIndex(5);
        System.out.println(byIndex);
        System.out.println();
        da.print();

    }
}
