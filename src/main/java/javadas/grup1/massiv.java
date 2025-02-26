package javadas.grup1;

public class massiv {

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 5, 6, 7, 8, 9, 9};
        for (int i = 0; i <a.length; i++) {
            System.out.print(a[i] +" ");
        }
        System.out.println();

        for (int i = 0; i < a.length-1; i++) {

            //a[i] = a[i - 1];

          //  a[3] = 4;



            for (int val : a) System.out.print(val + " ");

        }
        System.out.println();
        String s1 = "test";
        String s2 = "test";
        System.out.println(s1 == s2);

        System.out.println(s1.equals(s2));

        outer:
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Hello");
                continue outer;
            }
            System.out.println("outer");
        }
        System.out.println("Good-Bye");


    }
}
