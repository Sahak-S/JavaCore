package javadas.generics;

public class HierDemo2 {

    public static void main(String[] args) {

        Gen0 <String> w = new Gen0<String>("Добро пожаловать",47);
        System.out.println(w.getOb() +" ");
        System.out.println(w.getnum());
    }
}
