package homework.map;

import java.io.*;

public class D {
    public static void main(String[] args) throws IOException {

//        String phat = "C:\\Users\\User\\java_error_in_idea64_10760.log";
//        File file = new File(phat);


        //буферизация входного потока
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//объявление массива строк
        String masStr[] = new String[3];
//объявление массива целых чисел
        //int masInt[] = new int[3];
        String []str = new String[3];
        try {
            System.out.println("введите три целых числа,");
            System.out.println("после каждого нажмая Enter ->");
            for (int i = 0; i < 3; i++) {
//чтение строки, содержащей целое число
                //masStr[i] = br.readLine();
                str[i] = br.readLine();
//преобразование строки в целое число
                //masInt[i] = Integer.valueOf(masStr[i]).intValue();
                str[i] = String.valueOf(str[i].length());
            }
            System.out.print("массив: ");
            for (int i = 0; i < 3; i++) {
              //  System.out.print(masInt[i] + "; ");
                System.out.println(str[i] + ";");
            }
// обработка ошибки чтения с консоли
        } catch (IOException e) {
            System.out.print("ошибка ввода " + e);
/* обработка ошибки при неправильном формате целого
числа */
        } catch (NumberFormatException e) {
            System.out.print(
                    "неправильный формат числа " + e);
        }
    }
}