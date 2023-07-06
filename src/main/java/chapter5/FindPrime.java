package chapter5;

public class FindPrime {

    public static void main(String[] args) {

        int  num;
        boolean isPraime;

        num = 14;
        if (num < 2) isPraime = false;
        else isPraime = true;
        for (int i = 2; i <= num/2; i++) {
            if ((num % i) == 0) {
                break;
            }
        }
        if (isPraime) System.out.println("պարզ թվեր");
        else System.out.println("բարդ թվեր");
    }
}
