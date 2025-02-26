package javadas.aMap;

import com.sun.xml.internal.bind.v2.util.StackRecorder;
import lombok.var;

import java.util.HashMap;
import java.util.Map;

public class DemoArray {
    public static void main(String[] args) {
        int[] array = {6, 9, 2, 6, 2, 13, 4, 5, 3};


//        տպել թե որ էլեմենտներն են կրկնվում
//
//         3-ը կրկնվում է
//         6-ը կրկնվում է
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[i] + "-ը կրկնվում է");
                    count++;
                    break;
                }
            }
        }
        System.out.println(count +" angam" );








        Map<Integer, Integer> counter = new HashMap<>();
        for (int x : array) {
            int value = counter.getOrDefault(x, 0) + 1;
            counter.put(x, value);
        }
        System.out.println(counter);












        //տպել true եթե մասիվի բոլոր էլեմենտները զույգ են։
        //եթե ոչ՝ false

//        boolean result = true;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] % 2 != 0) {
//                result = false;
//                break;
//            }
//        }
//        System.out.println(result);
//        System.out.println();
    }
}
