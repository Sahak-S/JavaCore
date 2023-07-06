package chapter1;

public class Example {
    public static void main(String[] args) {

        System.out.println(" java ");
        System.out.println(010>9);

        int i = 0;
        i++;
        System.out.println(i);
        i = i++;
        System.out.println(i);
        System.out.println("1"+2+3);
        int var = 1;
        System.out.print(var++);
        System.out.print(++var);

        int var1 = 1;
        int var2 = 1;
//
        if (var1++ == ++var2){
            System.out.println(true);
        }else {
            System.out.println(false);
        }


    }
}
