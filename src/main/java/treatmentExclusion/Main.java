package treatmentExclusion;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] m = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("մուտքագրեք թիվը");

        int a = 0;
        try {
            a = scanner.nextInt();
            m[a] = 4 / a;
            System.out.println(m[a]);
        } catch (ArithmeticException e) {
            System.out.println("Տեղի է ունեցել չթույլատրվող արիտմատիկ գործողություն:" + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("կանչել ենք մասիվում գոյություն չունեցող էլեմենտ:" + e);
        }


    }
}
