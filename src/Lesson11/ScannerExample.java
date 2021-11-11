package Lesson11;

import Calc.Calculator;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;
        while (isRun) {

            System.out.println("please input a");
            int a = scanner.nextInt();
            System.out.println("please input b");
            int b = scanner.nextInt();
            //ընդունել c string սինվոլը որը կարողե լինել +,-,*,/
            //կախված սիմվոլից կանչել Calculator կլասի համապատասխան մեթոդը

            Calculator calculator = new Calculator();
            boolean isWrongOperation = false;
            do {
                System.out.println("pleas input operation(+,-,/,*) or 0 for exit");
                String c = scanner.next();
                System.out.println(c);
                switch (c) {
                    case "+":
                        System.out.println(calculator.gumarum(a, b));
                        break;
                    case "-":
                        System.out.println(calculator.hanum(a, b));
                        break;
                    case "/":
                        System.out.println(calculator.bajanum(a, b));
                        break;
                    case "*":
                        System.out.println(calculator.bazmapatkum(a, b));
                        isRun = false;
                        break;
                    default:
                        isWrongOperation = true;
                        System.out.println("Invalid Operation");


                }
            }while (isWrongOperation);




        }

    }

}

