package Grup1;

public class CarrArrey {
    public static void main(String[] args) {
        char[] charArrey = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'b';
        int count = 1;
        for (int i = 0; i < charArrey.length; i++) {
            if (charArrey[i] == 'o') {
                count++;
            }
        }
        System.out.println("count of =" + count);

        /////////////////////////


        int x = 0;
        x = charArrey.length / 2;
        System.out.print("մեջտեղի 2 թվերը = " + charArrey[x]);
        x--;
        System.out.println(charArrey[x]);




    }
}


