package javadas.generics;

public class GenMethDemo {

    static <T extends Comparable<T>, V extends T>
    boolean isIn(T x, V[] y) {
        for (int i = 0; i < y.length; i++) {
            if (x.equals(y[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // применить метод isin() для целых чисел
        Integer nums [] = {1,2,3,4,5};
        if (isIn(2,nums)){
            System.out.println("Чиcлo 2 содержится в массиве num");
        }
        if (!isIn(7,nums)){
            System.out.println("Чиcлo 7 отсутствует в массиве nums");
        }
        System.out.println();

        // применить метод isin() для символьных строк

        String strs [] = {"один", "два", "три", "четыре", "пять "};
        if (isIn("два",strs)){
            System.out.println(" два содержится в массиве strs");
        }
        if (!isIn("ceмь",strs)){
            System.out.println("ceмь отсутствует в массиве strs");
        }
    }

}
