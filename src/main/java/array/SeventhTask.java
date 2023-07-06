package array;

import java.util.Scanner;

//Напишите программу на Java, чтобы узнать, является ли число простым или нет.
public class SeventhTask {
    public static void main(String[] args) {
        int temp, number;

        boolean numberIsPrime = true;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();

        for (int x = 2; x <= number / 2; x++) {
            int tempNumber = number % x;
            if (tempNumber == 0) {
                numberIsPrime = false;
                break;
            }
        }
        if (numberIsPrime) {
            System.out.println(number + " число является простым");
        } else {
            System.out.println(number + " число не является простым");
        }
    }
}
