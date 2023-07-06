package grup.charArray;

public class CharArray {

    void print (char[] bolola){
        for (char c : bolola) {
            System.out.print(c + " ");

        }
        System.out.println();

    }
    void print0 (char[] bolola){
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
    }
    void print1 (char [] bolola){
        int x = 0;
        x = bolola.length / 2;
        System.out.print("մեջտեղի 2 թվերը = " + bolola[x]);
        x--;
        System.out.println(bolola[x]);
    }
    void print2 (char [] bolola){
        int y = 0;
        y = bolola.length - 1;
        if ('l' == bolola[y]) {
            System.out.println(true);
        } else if ('y' != bolola[y]) {

            System.out.println(false);
        }
    }
    void print3 (char[] babola){
        boolean t=false;
        for (int i = 0; i < babola.length; i++) {
            if ('b' == babola[i] && 'b' == babola [i+2]){
                t=true;
                break;
            }
        }
        System.out.println(t);
    }
    void print4 (char[] text){
        int startIndex = 0;
        int endIndex = text.length-1;

        while (startIndex < endIndex && text[startIndex] == ' ' ){
            startIndex++;
        }
        while (endIndex > startIndex && text[endIndex] == ' '){
            endIndex--;
        }
        char[] result = new char[(endIndex - startIndex) + 1];
        int index = 0;

        for (int i = startIndex; i <= endIndex ; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);

        }
    }


}
