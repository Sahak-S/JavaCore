package javadas.homework.newhomework;

public class Charutil {

    public static void main(String[] args) {

        //Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            char a = bolola[i];
            if (a == 'o'){
                count++;
            }

        }
        System.out.println("count =" + count);
        System.out.println();

        //պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        int x = 0;
        x = bolola.length/2;
        System.out.println(bolola[x]);
        x--;
        System.out.print(bolola[x]);
        System.out.println();

        //պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

        int y = 0;
        y = bolola.length-1;
        if ('l' == bolola[y]|| 'y' == bolola[y]){
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }

        //Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։

        char[] bobola = {'b','a','b','o','k','a',};
        boolean t = false;
        for (int i = 0; i < bobola.length; i++) {
            if ('b' == bobola[i] && 'b' == bobola[i+2]){
                t = true;
                break;
            }
        }
        System.out.println(t);

       //
        char[] text = {' ',' ',' ','b','a','r','e','v',' ',' ','j','a','v','a',' '};

        int startIndex = 0;
        int endIndex = text.length - 1;
        if (startIndex < endIndex && text[startIndex] == ' '){
            startIndex ++;
        }
        if (endIndex > startIndex && text[endIndex] == ' '){
            endIndex --;
        }
        char[] result = new char[(endIndex - startIndex) + 1];
        int index = 0;
        for (int i = startIndex; i <=endIndex; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result);

        }

    }
}
