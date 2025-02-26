package javadas.aList;

import java.util.Scanner;

public class ATM {

    static int balance = 10000; // initial balance
    static int withdraw, deposit;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Բարի գալուստ բանկոմատ");
            System.out.println("1. Ստուգեք մնացորդը");
            System.out.println("2. Հանել");
            System.out.println("3. Ավանդ");
            System.out.println("4. Ելք");
            System.out.print("Մուտքագրեք ձեր ընտրությունը: ");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    deposit();
                    break;
                case 4:
                    System.out.println("Շնորհակալություն բանկոմատից օգտվելու համար");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Անվավեր ընտրություն: Խնդրում եմ կրկին փորձեք.");
            }
        }
    }

    public static void checkBalance() {
        System.out.println("Ձեր ընթացիկ հաշվեկշիռն է $" + balance);
    }

    public static void withdraw() {
        System.out.print("Մուտքագրեք այն գումարը, որը ցանկանում եք հանել: $");
        withdraw = scan.nextInt();
        if (balance >= withdraw) {
            balance = balance - withdraw;
            System.out.println("Ձեր նոր հաշվեկշիռը $" + balance);
        } else {
            System.out.println("Անբավարար հաշվեկշիռ: Խնդրում ենք ստուգել ձեր հաշվի մնացորդը և նորից փորձել\n.");
        }
    }

    public static void deposit() {
        System.out.print("Մուտքագրեք այն գումարը, որը ցանկանում եք ավանդ դնել: $");
        deposit = scan.nextInt();
        balance = balance + deposit;
        System.out.println("Ձեր նոր հաշվեկշիռը $" + balance);
    }
}
