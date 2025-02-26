package javadas.generics;

public class HierDemo {
    public static void main(String[] args) {

        Gen2<String,Integer> x = new Gen2<String,Integer>("Значение равно:",99);
        System.out.println(x.getob());
        System.out.println(x.getob2());
    }
}
