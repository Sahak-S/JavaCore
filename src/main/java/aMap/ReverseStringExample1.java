package aMap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class ReverseStringExample1 {

    public static void main(String[] args) {
//        String s = "ug oui oui";
//        for (int i = s.length(); i > 0; i--) {
//            System.out.print(s.charAt(i - 1));
//        }

        int commission2=0;
        int commission1=0;
        int cash;
        int pay1=0;
        int less=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert Cash Please");
        cash = scanner.nextInt();
        if (cash >= 8) {
            commission1 = (cash / 100) * 7;
            pay1 = cash - commission1;
            less = cash % 100;
        }
        if (less > 0) {
            commission2 = 7;
        }
        if (cash < 8) {
            System.out.println("Transaction Impossible");
        }
        pay1 = cash - commission1 - commission2;
        System.out.println("Your Entered Cash =" + cash);
        System.out.println("Your Pay =" + pay1);
        System.out.println("Commission =" + (commission1 + commission2));




    }
}
