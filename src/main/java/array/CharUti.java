package array;

public class CharUti {
    public static void main(String[] args) {

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};

        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (c == bolola[i]){
                count++;
            }

        }
        System.out.println(count);

        int a = 0;
        a = bolola.length/2;
        System.out.print(bolola[a]);
        a--;
        System.out.print(bolola[a]);
        System.out.println();

        int b = 0;
        b = bolola.length-1;
        if ('l' == bolola[b]&&'y' == bolola[b]){
            System.out.println(true);
        }else {
            System.out.println(false);
        }

        char[] bobola = {'b','a','b','o','k','a',};

        boolean x = false;

        for (int i = 0; i < bobola.length; i++) {
            if ('b' == bobola[i] && 'b' == bobola[i+2]){
                x = true;
                break;
            }
        }
        System.out.println(x);
    }
}
