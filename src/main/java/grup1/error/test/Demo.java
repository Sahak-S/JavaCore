package grup1.error.test;

public class Demo {

    private int anInt = 4;

    public Demo() {
        anInt = 5;
    }

    public static void main(String[] args) {


        Demo m = new Demo();
        int anInt = 6;
        m.print(anInt);

        int i = 0;
        i++;
        System.out.print(i);
        i = i++;
        System.out.println(i);
    }

    public void print(int anInt){
        System.out.println(anInt);
    }

}
