package aMap;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[]array = {12,54,68,4,-1};



        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(array.length/2);
        System.out.println();

        int[]a = {1,2,3,4};
        int[]b = {4,16,1,2,3,22};
        int[]c = new int[a.length+b.length];
        int count = 0;
        for(int i = 0; i<a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for(int j = 0;j<b.length;j++) {
            c[count++] = b[j];
        }
        for(int i = 0;i<c.length;i++)
            System.out.print(c[i]+" ");

        System.out.println();
        System.out.println();

        //2 mec  tiv
        int[] my_array = {1, 5, 18, 12, 0, -1, -9, 17, 7, 5};
        System.out.println("Սկզբնական թվային զանգված: "+Arrays.toString(my_array));
        Arrays.sort(my_array);
        int index = my_array.length-1;
        while(my_array[index]==my_array[my_array.length-1]){
            index--;
        }
        System.out.println("Երկրորդ ամենաբարձր արժեքը: " + my_array[index]);
    }


}
