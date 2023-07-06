package homework.newhomework;

public class Test1 {

    public static void main(String[] args) {

        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};

        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            // char a = bolola[i];
            if (bolola[i] == 'o') {
                count++;
            }
        }
        System.out.println(count);

        int x = 0;
        x = bolola.length / 2;
        System.out.print(bolola[x]);
        x--;
        System.out.println(bolola[x]);

        int y = 0;
        y = bolola.length - 1;
        if ('l' == bolola[y]) {
            System.out.println(true);
        } else if ('y' != bolola[y]) {
            System.out.println(false);
        }


        char[] bobola = {'b', 'a', 'b', 'o', 'k', 'a',};

        boolean b = false;
        for (int i = 0; i < bobola.length; i++) {
            if ('b' == bobola[i] && 'b' == bobola[i + 2]) {
                b = true;
                break;
            }

        }
        System.out.println(b + " ");


        char[] text = {' ', ' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' ', 'j', 'a', 'v', 'a', ' '};

        int startIndex = 0;
        int endIndex = text.length - 1;
        if (startIndex < endIndex && text[startIndex] == ' ') {
            startIndex++;
        }
        if (endIndex > startIndex && text[endIndex] == ' ') {
            endIndex--;
        }
        char[] result = new char[(endIndex - startIndex) + 1];
        int index = 0;

        for (int i = startIndex; i <= endIndex; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result);

        }
    }
}
