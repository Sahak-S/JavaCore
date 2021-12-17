package education.util;

public class ArrayUtil {
    public static void deleteByIndex(Object[] students, int index, int size) {

        for (int i = index + 1; i < size; i++) {
            students[i - 1] = students[i];
        }
    }
}
