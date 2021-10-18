package Homework;

public class Charutil {
    public static void main(String[] args) {

                      // 1

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            char a = bolola[i];
            if (a == 'o') {
                count++;
            }
        }
        System.out.println("count =" + count);
        System.out.println();

                      // 2

        int x = 0;
        x = bolola.length / 2;
        System.out.print("մեջտեղի 2 թվերը = " + bolola[x]);
        x--;
        System.out.println(bolola[x]);

                  // 3

        int y = 0;
        y = bolola.length - 1;
        if ('l' == bolola[y]) {
            System.out.println(true);
        } else if ('l' != bolola[y]) {

            System.out.println(false);
        }

                      // 4

       char [] babola = {'j','a','b','o','b','a',};
        boolean t=false;
        for (int i = 0; i < babola.length; i++) {
            if ('b' == babola[i] && 'b' == babola [i+2]){
                t=true;
                break;
            }
        }System.out.println(t);


                       // 5

        char[] text = {' ',' ',' ','b','a','r','e','v',' ',' ',')'};

        for (int i = 0; i < text.length; i++) {

            if (' ' != text[i]){
                System.out.print(text[i]);
            }

        }



    }
}
