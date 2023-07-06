package enumerationsEnum;

public class AutoBoxS {

    public static void main(String[] args) {

        Boolean b = true;

        if (b){
            System.out.println("b равно true");
        }
        Character ch = 'x';
        char ch2 = ch;
        System.out.println("ch2 равно " + ch2);
        System.out.println(ch.equals(ch2));
        System.out.println(ch == ch2);
        System.out.println(ch.compareTo(ch2));
        System.out.println(ch.charValue());
        System.out.println(ch.getClass());
        System.out.println(ch.hashCode());
    }
}
