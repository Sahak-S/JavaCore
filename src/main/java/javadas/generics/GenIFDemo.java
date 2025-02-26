package javadas.generics;

public class GenIFDemo {

    public static void main(String[] args) {
        Integer [] inums = {3,6,2,5,8,12};
        Character [] chs = {'b','c','t','w','p','^','@','+','.','0'};
        String [] str = {"java","c++","world","autocad","ww","text","c#","piton"};

        MyClass<Integer> iOb = new MyClass<>(inums);
        MyClass<Character> cOb = new MyClass<>(chs);
        MyClass<String> sOb = new MyClass<>(str);

        System.out.println("Մաքսիմում արժեքը հավասար է  inums = " + iOb.max());
        System.out.println("Մինիմում արժեքը հավասար է inums = " + iOb.min());
        System.out.println("Մաքսիմում արժեքը հավասար է chs = " + cOb.max());
        System.out.println("Մինիմում արժեքը հավասար է chs = " + cOb.min());

        System.out.println("Մաքսիմում արժեքը հավասար է str = " + sOb.max());
        System.out.println("Մինիմում արժեքը հավասար է str = " + sOb.min());
    }
}
